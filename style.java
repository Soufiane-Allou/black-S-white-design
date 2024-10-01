// تأثيرات إضافية للأيقونات في المنتصف
document.addEventListener('DOMContentLoaded', () => {
    const icons = document.querySelectorAll('.icon');

    icons.forEach((icon) => {
        icon.addEventListener('mouseenter', () => {
            icon.style.backgroundColor = '#f0f0f0';
            icon.style.borderRadius = '15px';
        });

        icon.addEventListener('mouseleave', () => {
            icon.style.backgroundColor = 'transparent';
            icon.style.borderRadius = '0';
        });
    });
});
