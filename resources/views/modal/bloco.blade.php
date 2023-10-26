<div id="blocoModal-{{ $modulo->id}}" tabindex="-1" aria-hidden="true" class="fixed bg-menubg/40  top-0 left-0 right-0 z-50 hidden w-full p-4 overflow-x-hidden overflow-y-auto md:inset-0 h-full max-h-full">
    <div class=" w-full h-full  max-h-full">
        <!-- Modal content -->
        <div class="w-100vw bg-menubg rounded-lg shadow">
            <div class="grid grid-cols-3 w-full h-full justify-items-center content-center">
                <div class="w-1/3 order-1" ></div>
                <div class="text-xl w-1/3 font-medium text-white self-center order-2">
                    <span class=" text-xs">{{ $modulo->linguagem}}</span>
                </div>
                <div class="order-3 w-1/3 justify-self-end">
                    <button type="button" class="bg-transparent hover:bg-maincolor-100 rounded-lg mt-2  w-8 h-8 inline-flex justify-center items-center" data-modal-hide="blocoModal-{{ $modulo->id}}">
                        <i class="fa-solid fa-xmark fa-xl" style="color: #ffffff;"></i>
                        <span class="sr-only">Close modal</span>
                    </button>
                </div>
            </div>
            <div class="px-6 py-6 lg:px-8">



                <form class="space-y-6" action="{{route('criar_bloco')}}" method="post">
                    @csrf
                    <div class="flex align-middle">

                        <input type="text" name="nome" class="bg-menubg border border-maincolor-100 text-[#838383] text-5xl rounded-lg focus:ring-menubg focus:border-menubg block w-2/3   p-2.5 " placeholder="Digite um título" required>

                        
                        <select id="selectLanguage" class="1/3">
                            <option value="language-html">HTML</option>
                            <option value="language-javascript">JavaScript</option>
                            <option value="language-python">Python</option>
                            <option value="language-java">Java</option>
                            <option value="language-csharp">C#</option>
                            <option value="language-php">PHP</option>
                            <option value="language-cpp">C++</option>
                            <option value="language-typescript">TypeScript</option>
                            <option value="language-ruby">Ruby</option>
                            <option value="language-swift">Swift</option>
                            <option value="language-kotlin">Kotlin</option>
                        </select>
                    </div>
                    <pre class=""><code class="language-html"></code></pre>



                    <button type="submit" class="w-full text-blac bg-maincolor-100 hover:bg-maincolor-200 focus:ring-4 focus:outline-none focus:ring-maincolor-300 font-medium rounded-lg text-sm px-5 py-2.5 text-white text-center ">Criar Bloco</button>

                </form>
            </div>

        </div>
    </div>
</div>
<script type="text/javascript">
    const textarea1 = document.getElementById("textarea1");
    const codeBlock = document.getElementById("codeBlock");

    // copy code from textarea to code block
    function updateCode() {

        let content = textarea1.value;

        // encode the special characters 
        content = content.replace(/&/g, '&amp;');
        content = content.replace(/</g, '&lt;');
        content = content.replace(/>/g, '&gt;');

        // fill the encoded text to the code
        codeBlock.innerHTML = content;

        // call highlight.js to render the syntax highligtning
        highlightJS();
    }

    // syntax highlight
    function highlightJS() {
        document.querySelectorAll('pre code').forEach((el) => {
            hljs.highlightElement(el);
        });
    }

    // detect content changes in the textarea
    textarea1.addEventListener("input", () => {
        updateCode();
    });

    // sync the scroll bar position between textarea and code block
    textarea1.addEventListener("scroll", () => {
        codeBlock.scrollTop = textarea1.scrollTop;
        codeBlock.scrollLeft = textarea1.scrollLeft;
    });

    window.onload = function() {
        // Selecione o input pelo ID
        var inputElement = document.getElementById("textarea1");

        // Coloque o input em foco
        inputElement.focus();
        updateCode();
    };

    // applying shortcut keys
    textarea1.addEventListener('keydown', function(e) {

        // [Enter] key pressed detected
        if (e.key === 'Enter') {

            // Prevent the default behavior (new line)
            e.preventDefault();

            // Get the cursor position
            var cursorPos = textarea1.selectionStart;

            // Get the previous line
            var prevLine = textarea1.value.substring(0, cursorPos).split('\n').slice(-1)[0];

            // Get the indentation of the previous line
            var indent = prevLine.match(/^\s*/)[0];

            // Add a new line with the same indentation
            textarea1.setRangeText('\n' + indent, cursorPos, cursorPos, 'end');

            // remove focus
            textarea1.blur();

            // regain focus (this is force the textarea scroll to caret position in case the caret falls out the textarea visible area)
            textarea1.focus();

            // copy the code from textarea to code block      
            updateCode();
            return;
        }

        // [Tab] pressed, but no [Shift]
        if (e.key === "Tab" && !e.shiftKey &&

            // and no highlight detected
            textarea1.selectionStart == textarea1.selectionEnd) {

            // suspend default behaviour
            e.preventDefault();

            // Get the current cursor position
            let cursorPosition = textarea1.selectionStart;

            // Insert 4 white spaces at the cursor position
            let newValue = textarea1.value.substring(0, cursorPosition) + "    " +
                textarea1.value.substring(cursorPosition);

            // Update the textarea value and cursor position
            textarea1.value = newValue;
            textarea1.selectionStart = cursorPosition + 4;
            textarea1.selectionEnd = cursorPosition + 4;

            // copy the code from textarea to code block      
            updateCode();
            return;
        }

        // [Tab] and [Shift] keypress presence
        if (e.key === "Tab" && e.shiftKey &&

            // no highlight detected
            textarea1.selectionStart == textarea1.selectionEnd) {

            // suspend default behaviour
            e.preventDefault();

            // Get the current cursor position
            let cursorPosition = textarea1.selectionStart;

            // Check the previous characters for spaces
            let leadingSpaces = 0;
            for (let i = 0; i < 4; i++) {
                if (textarea1.value[cursorPosition - i - 1] === " ") {
                    leadingSpaces++;
                } else {
                    break;
                }
            }

            if (leadingSpaces > 0) {
                // Remove the spaces
                let newValue = textarea1.value.substring(0, cursorPosition - leadingSpaces) +
                    textarea1.value.substring(cursorPosition);

                // Update the textarea value and cursor position
                textarea1.value = newValue;
                textarea1.selectionStart = cursorPosition - leadingSpaces;
                textarea1.selectionEnd = cursorPosition - leadingSpaces;
            }

            // copy the code from textarea to code block
            updateCode();
            return;
        }

        // [Tab] key pressed and range selection detected
        if (e.key == 'Tab' & textarea1.selectionStart != textarea1.selectionEnd) {
            e.preventDefault();

            // split the textarea content into lines
            let lines = this.value.split('\n');

            // find the start/end lines
            let startPos = this.value.substring(0, this.selectionStart).split('\n').length - 1;
            let endPos = this.value.substring(0, this.selectionEnd).split('\n').length - 1;

            // calculating total removed white spaces
            // these values will be used for adjusting new cursor position
            let spacesRemovedFirstLine = 0;
            let spacesRemoved = 0;

            // [Shift] key was pressed (this means we're un-indenting)
            if (e.shiftKey) {

                // iterate over all lines
                for (let i = startPos; i <= endPos; i++) {

                    // /^ = from the start of the line,
                    // {1,4} = remove in between 1 to 4 white spaces that may existed
                    lines[i] = lines[i].replace(/^ {1,4}/, function(match) {

                        // "match" is a string (white space) extracted

                        // obtaining total white spaces removed

                        // total white space removed at first line
                        if (i == startPos)
                            spacesRemovedFirstLine = match.length;

                        // total white space removed overall
                        spacesRemoved += match.length;

                        return '';
                    });
                }
            }

            // no shift key, so we're indenting
            else {
                // iterate over all lines
                for (let i = startPos; i <= endPos; i++) {
                    // add a tab to the start of the line
                    lines[i] = '    ' + lines[i]; // four spaces
                }
            }

            // remember the cursor position
            let start = this.selectionStart;
            let end = this.selectionEnd;

            // put the modified lines back into the textarea
            this.value = lines.join('\n');

            // adjust the position of cursor start selection
            this.selectionStart = e.shiftKey ?
                start - spacesRemovedFirstLine : start + 4;

            // adjust the position of cursor end selection
            this.selectionEnd = e.shiftKey ?
                end - spacesRemoved : end + 4 * (endPos - startPos + 1);

            // copy the code from textarea to code block      
            updateCode();
            return;
        }

        // [Shift] + [Del]/[Backspace] = Delete entire line(s)
        if (e.shiftKey && (e.key === "Delete" || e.key === "Backspace")) {

            e.preventDefault();

            // find the start/end lines
            let startPos = this.value.substring(0, this.selectionStart).split('\n').length - 1;
            let endPos = this.value.substring(0, this.selectionEnd).split('\n').length - 1;

            // get the line and the position in that line where the cursor is
            // pop() = take out the last line (which is the cursor selection start located)
            let cursorLine = this.value.substring(0, this.selectionStart).split('\n').pop();

            // get the position of cursor within the last line
            let cursorPosInLine = cursorLine.length;

            // calculating total lines to be removed
            let totalLinesRemove = endPos - startPos + 1;

            // split the textarea content into lines
            let lines = this.value.split('\n');

            // calculate new cursor position
            let newStart = lines.slice(0, startPos).join('\n').length + (startPos > 0 ? 1 : 0);
            // add 1 if startPos > 0 to account for '\n' character

            // remove the selected lines
            lines.splice(startPos, totalLinesRemove);

            // get the new line where the cursor will be after deleting lines
            // if lines[startPos] is not existed, then the new line will be an empty string
            let newLine = lines[startPos] || '';

            // if the new line is shorter than the cursor position, put the cursor at the end of the line
            if (newLine.length < cursorPosInLine) {
                cursorPosInLine = newLine.length;
            }

            // adjuct the cursor's position in the line to the new cursor position
            newStart += cursorPosInLine;

            // put the modified lines back into the textarea
            this.value = lines.join('\n');

            // set the new cursor position
            // both cursor selection start and end will be at the same position
            this.selectionStart = this.selectionEnd = newStart;

            // copy the code from textarea to code block      
            updateCode();
            return;
        }

        // Move cursor to the first non-white space character
        if (e.key === "Home") {

            // get the line and the position in that line where the cursor is
            // pop() = take out the last line (which is the cursor selection start located)
            let line = this.value.substring(0, this.selectionStart).split('\n').pop();

            // get the position of cursor within the last line
            let cursorPosInLine = line.length;

            // Find the start of the current line
            let lineStartPos = this.value.substring(0, this.selectionStart).lastIndexOf('\n') + 1;

            // Find the first non-whitespace character on the line
            let firstNonWhitespacePos = line.search(/\S/);

            // the cursor's position is already in front of first non-whitespace character,
            // or it's position is before first none-whitespace character,
            // move the cursor to the start of line
            if (firstNonWhitespacePos >= cursorPosInLine) {
                // do nothing, perform default behaviour, which is moving the cursor to beginning of the line
                return true;
            }
            // If there's no non-whitespace character, this is an empty or whitespace-only line
            else if (firstNonWhitespacePos === -1) {
                // do nothing, perform default behaviour, which is moving the cursor to beginning of the line
                return true;
            }

            // Prevent the default Home key behavior
            e.preventDefault();

            // Move the cursor to the position of the first non-whitespace character
            this.selectionStart = this.selectionEnd = lineStartPos + firstNonWhitespacePos;

            return;
        }


    });






    // change programming language
    document.getElementById("selectLanguage").addEventListener("change", function() {
        document.getElementById("codeBlock").className = this.value;
        highlightJS();
    });
</script>