<?php
$path = '/';
$files = glob("*.mp4");
$serveruri= ' ';

if($_GET['apikey'] == 'connect'){
foreach ($files as $file){
    if(is_file($file)){
        echo $data = '{"video_url":"'.$serveruri.rawurlencode($file).'"}'; //$data = '{"video":[{"video_url":"'.$file.'"}]}'
    }
}
}else {
    echo base64_decode('R2V0dGluZyBOdWxsIFJlc3BvbnNl');
}

#####Later We try ####
?>
<?php
if($_GET['apikey'] == 'connect'){
$path = '/videos';
$jl=  '[';
$jr=  ']';
echo $jl.fileset().$jr;
}else {
    echo base64_decode('R2V0dGluZyBOdWxsIFJlc3BvbnNl');
}
function fileset(){
$serveruri= '';
$files = glob("*.mp4");
foreach ($files as $file){
    if(is_file($file)){
    //   return $file; //$data = '{"video":[{"video_url":"'.$file.'"}]}'
    $vidurl= '{"video_url": "'.$serveruri.rawurlencode($file).'" },';
     echo $vidurl;
    }
}
}
?>



