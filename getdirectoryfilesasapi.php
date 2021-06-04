<?php
header('Content-Type: application/json');

$dir          = "./vid"; //path

$list = array(); //main array
$serveruri = "https://#####/videos/";
if(is_dir($dir)){
    if($dh = opendir($dir)){
        while(($file = readdir($dh)) != false){

            if($file == "." or $file == ".."){
                //...
            } else { //create object with two fields
                $list3 = array('video_url' => $serveruri.rawurlencode($file));
               
                array_push($list, $list3);
            }
        }
    }

    $return_array = array('files'=> $list);
    $fin_links = array_rand(array_flip($return_array)); // To Shuffle the links

    echo json_encode($return_array);
}
?>



