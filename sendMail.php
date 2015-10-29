<?php 
require 'PHPMailer'.DIRECTORY_SEPARATOR.'PHPMailerAutoload.php';

function prepareMail() {
  $body = '';
  foreach($_POST as $key => $value) {
    $body .= '<b>'.ucfirst(str_replace('_', ' ', $key)) .'</b> - '. $value .'<br>';
  }
  return $body;
}

$mailBody = prepareMail();

$mail = new PHPMailer;

//Tell PHPMailer to use SMTP
$mail->isSMTP();
//Enable SMTP debugging
// 0 = off (for production use)
// 1 = client messages
// 2 = client and server messages
$mail->SMTPDebug = 2;
//Ask for HTML-friendly debug output
$mail->Debugoutput = 'html';
//Set the hostname of the mail server
$mail->Host = "smtp.gmail.com";
//Set the SMTP port number - likely to be 25, 465 or 587
$mail->Port = 465;
//Whether to use SMTP authentication
$mail->SMTPAuth = true;
//Username to use for SMTP authentication
$mail->Username = "aynigroup56@gmail.com";
//Password to use for SMTP authentication
$mail->Password = "aynigroup";
//Set who the message is to be sent from
//$mail->setFrom('from@example.com', 'First Last');

$mail->setFrom('aynigroup56@gmail.com');
$mail->addAddress('mukeshs@chetu.com', 'Joe User');     // Add a recipient
//$mail->addAddress('mayanktechpro@yopmail.com');               // Name is optional
//$mail->addReplyTo('mayanktechpro@yopmail.com', 'Information');
//$mail->addCC('mayanktechpro@yopmail.com');
//$mail->addBCC('mayanktechpro@yopmail.com');

$mail->isHTML(true);                                  // Set email format to HTML

$mail->Subject = 'Here is the subject';
$mail->Body    = $mailBody;
//$mail->AltBody = strip_tags($mail_body);

if(!$mail->send()) {
    echo 'Message could not be sent.';
    echo 'Mailer Error: ' . $mail->ErrorInfo;
} else {
    echo 'Message has been sent';
}