
// تفعيل البحث عندما يضغط المستخدم على زر "Search"
document.getElementById("search-btn").addEventListener("click", function() {
    const query = document.getElementById("search-input").value;
    if(query) {
        // مثال بسيط للتنقل إلى صفحة نتائج البحث
        window.location.href = https://www.google.com/search?q=${query};
    }
});
const roomImages = document.querySelectorAll('.room-image');

roomImages.forEach(image => {
    image.addEventListener('click', () => {
        window.open(image.src, '_blank');
    });
});
// Get all the room images
const roomImages = document.querySelectorAll('.room-image');

// Add click event listener to each room image
roomImages.forEach(image => {
    image.addEventListener('click', () => {
        // Open the image in full size
        window.open(image.src, '_blank');
    });
});
// افترض أن لديك متغيرات لتخزين تاريخ البداية والنهاية
var startDate = document.getElementById('reservation-date').value;
var endDate = document.getElementById('to-date').value;

// تحديث النص في العناصر
document.getElementById('booked-date').textContent = تم حجز موعد من ${startDate} إلى ${endDate};
var reservationDate = localStorage.getItem('reservationDate');
if (reservationDate) {
  $('.reservation-info').html('تم الحجز بتاريخ: ' + reservationDate + '<br>تم الحجز اختر غرفتك الآن').css('color', '#008000');
}
$('#reservation-date').change(function() {
    var reservationDate = $(this).val();
    localStorage.setItem('reservationDate', reservationDate);
  });
  