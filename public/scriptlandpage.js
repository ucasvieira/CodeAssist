const myObserver = new IntersectionObserver((entries) => {
    entries.forEach((entry) => {
      if (entry.isIntersecting) {
        entry.target.style.opacity = 1;
        entry.target.style.filter = 'blur(0)';
        entry.target.style.transform = 'translateX(0)';
      } else {
        entry.target.style.opacity = 0;
        entry.target.style.filter = 'blur(15px)';
        entry.target.style.transform = 'translateX(-100%)';
      }
    });
  });
  
  const elements = document.querySelectorAll('#hidden');
  
  elements.forEach((element) => myObserver.observe(element));