// إنشاء الأشكال المتحركة بشكل عشوائي
const shapesContainer = document.getElementById('animatedShapes');

function createRandomShape() {
    const shape = document.createElement('div');
    shape.classList.add('shape');

    // تعيين حجم وشكل عشوائي
    const size = Math.random() * 100 + 50; // بين 50px و150px
    shape.style.width = ${size}px;
    shape.style.height = ${size}px;

    // تعيين موضع عشوائي
    shape.style.top = ${Math.random() * 100}vh;
    shape.style.left = ${Math.random() * 100}vw;

    // إضافة الشكل إلى الصفحة
    shapesContainer.appendChild(shape);

    // إزالة الشكل بعد انتهاء الحركة لإفساح المجال لأشكال جديدة
    setTimeout(() => {
        shape.remove();
    }, 10000); // مدة الحركة
}

// إنشاء أشكال كل ثانية
setInterval(createRandomShape, 1000);
