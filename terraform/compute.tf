resource "aws_instance" "jenkins-instance" {
  ami             = var.instance_ami	#ubuntu ami for ohio region.
  instance_type   = var.instance_type
  key_name        = var.keyname
  #user_data = file("install_jenkins.sh")
  associate_public_ip_address = true
  tags = {
    Name = "Prod_server"
  }
  
  ebs_block_device {
    device_name = "/dev/sda1"
    volume_size = 20
  }
}
