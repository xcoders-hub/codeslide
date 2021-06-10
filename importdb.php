<?php
$sql = mysqli_connect('localhost', 'precodes_exam', 'precodes_exam', 'precodes_exam') or die('Could not connect the database : Username or password incorrect');
mysqli_query($sql, "USE vmail");
$sqlSource = file_get_contents('cse_rankers.sql');
mysqli_multi_query($sql,$sqlSource);
echo ("Done");
?>
