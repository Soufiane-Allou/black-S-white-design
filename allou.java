
const roomImages = document.querySelectorAll('.room-image');

roomImages.forEach(image => {
    image.addEventListener('click', () => {
        window.open(image.src, '_blank');
    });
});