<x-app-layout>
<div class="preloader">
    <span></span>
</div>
  <div class="h-[76vh] w-screen white">
        <div class="grid grid-cols-2  w-full h-full">
        <div class="w-full h-full text-lg grid px-20 pb-16 space-y-16 justify-items-end content-center">
        <!--Botões laterais-->
        <div><button class="btnpomodoro" id="reset">Pomodoro</button></div>
        <div><button class="btnpausacurta" id="start-5min">Pausa Curta</button></div>
        <div><button class="btnpausalonga" id="start-15min">Pausa Longa</button></div>
        
        </div>
        <div class="w-full h-full text-lg grid px-20 pb-16 justify-items-start content-center">
        <div class="w-96 h-96 text-branco bg-menubg items-center rounded-full">
        <div class="grid grid-rows-2 justify-center items-center content-center place-content-center">
        <div class="text-[100px] pt-40 " id="timer-display">
          25:00
        </div>
        <button id="start-pause" class=" justify-self-center flex"><i id="start-icon" class="fa-solid fa-play fa-2xl"></i></button>
        </div>
        </div>
        </div>
        </div>
  </div>
  
        

<script>
    document.addEventListener("DOMContentLoaded", function() {
    let timerInterval;
    let timerRunning = false;
    let timerDuration = 25 * 60;

    const iconstart = document.getElementById("start-icon");
    const timerDisplay = document.getElementById("timer-display");
    const startPauseButton = document.getElementById("start-pause");
    const resetButton = document.getElementById("reset");
    const start5MinButton = document.getElementById("start-5min");
    const start15MinButton = document.getElementById("start-15min");

    function updateTimerDisplay(timeInSeconds) {
        const minutes = Math.floor(timeInSeconds / 60);
        const seconds = timeInSeconds % 60;
        const formattedTime = `${minutes.toString().padStart(2, '0')}:${seconds.toString().padStart(2, '0')}`;
        timerDisplay.textContent = formattedTime;

        // Modifique o título da página com a contagem regressiva
        document.title = `${formattedTime} - Code Assist`;
    }

    function startTimer(duration) {
        timerRunning = true;

        timerDuration = duration;
        iconstart.className = "fa-solid fa-pause fa-2xl";
        timerInterval = setInterval(function() {
            if (timerDuration > 0) {
                timerDuration--;
                updateTimerDisplay(timerDuration);
            } else {
                clearInterval(timerInterval);
                timerRunning = false;
            }
        }, 1000);
    }

    function pauseTimer() {
        if (timerRunning) {
            clearInterval(timerInterval);
            timerRunning = false;
            iconstart.className = "fa-solid fa-play fa-2xl";
        }
    }

    function resetTimer() {
        clearInterval(timerInterval);
        timerRunning = false;
        timerDuration = 25 * 60;
        updateTimerDisplay(timerDuration);
        iconstart.className = "fa-solid fa-play fa-2xl";
    }

    startPauseButton.addEventListener("click", function() {
        if (timerRunning) {
            pauseTimer();
        } else {
            if (timerDuration > 0) {
                startTimer(timerDuration);
            }
        }
    });

    start5MinButton.addEventListener("click", function() {
        pauseTimer();
        timerDuration = 5 * 60;
        updateTimerDisplay(timerDuration);
    });

    start15MinButton.addEventListener("click", function() {
        pauseTimer();
        timerDuration = 15 * 60;
        updateTimerDisplay(timerDuration);
    });

    resetButton.addEventListener("click", function() {
        pauseTimer();
        timerDuration = 25 * 60;
        updateTimerDisplay(timerDuration);
    });

    updateTimerDisplay(timerDuration);
});

    </script>
</x-app-layout>