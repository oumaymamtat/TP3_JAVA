<?php
header('Access-Control-Allow-Origin: *');
try{
    $bdd = new PDO('mysql:host=localhost;dbname=gestion_etudiant;charset=utf8','root','');
}catch(Exception $e){
    die("Error :".$e->getMessage());
}

$req = "SELECT * From Etudiant";
$response = $bdd->query($req);
if($response->rowCount()>0){
    $outputs["etudiants"]=array();
    while($row = $response->fetch(PDO::FETCH_ASSOC)){
        $etudiant = array();
        $etudiant["cin"]=$row["cin"];
        $etudiant["nom"]=$row["nom"];
        $etudiant["prenom"]=$row["prenom"];
        $etudiant["email"]=$row["email"];
        $etudiant["password"]=$row["password"];
        $etudiant["adresse"]=$row["adresse"];
        $etudiant["classe"]=$row["classe"];
        array_push($outputs["etudiants"],$etudiant);
    }
    $outputs["success"]=1;
    echo json_encode($outputs);
}else{
    $outputs["success"]=0;
    echo json_encode($outputs);
}


?>