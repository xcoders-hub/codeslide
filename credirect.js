<script>
var checkStatus;

var element = new Image();
Object.defineProperty(element, 'id', {
  get: function() {
    checkStatus='on';
    window.location = "https://movies.driveup.in";
  }
});

requestAnimationFrame(function check() {
  checkStatus = 'off';
  console.dir(element);
  //document.querySelector('#devtool-status').className  = checkStatus;
  requestAnimationFrame(check);
});
</script>
