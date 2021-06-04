header('Content-Type: application/json');
function shuffle_assoc($list) { 
  if (!is_array($list)) return $list; 

  $keys = array_keys($list); 
  shuffle($keys); 
  $random = array(); 
  foreach ($keys as $key) { 
    $random[$key] = $list[$key]; 
  }
  return $random; 
} 
$dir          = "vid"; //path

$list = array(); //main array
$serveruri = "http://codeslide.in/test/vidapi/vid/";
if(is_dir($dir)){
    if($dh = opendir($dir)){
        while(($file = readdir($dh)) != false){
            if($file == "." or $file == ".."){
                //...
            } else { //create object with two fields
                $list3 = array(
                    'video_url' => $serveruri.rawurlencode($file),
                    'video_title' => 'My Video Title'
                    );                 
                array_push($list, $list3);
            }
        }
    }

    $return_array = $list;   
    echo json_encode(shuffle_assoc($return_array));
}
