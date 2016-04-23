struct Point{
  int x;
  int y;
};

void setup(){
  Serial.begin(9600);
  
}
Point p = {0,0};
int i =100;
void loop(){

  delay(3000);//waiting for connection
  //p.x = readX(), p.y = readY();

  
  while(Serial.available()){    
    Serial.println(p.x+i+i);
    Serial.println(p.y+i);
    i+= 100;
    delay(1000);
  }

  /*
   * 
  delay(3000);//waiting for connection
  Serial.println(1000,DEC);
  Serial.println(800,DEC);
  delay(1000);
  Serial.println(300,DEC);
  Serial.println(460,DEC);
  delay(1000);
  Serial.println(50,DEC);
  Serial.println(360,DEC);
  delay(1000);
  Serial.println(70,DEC);
  Serial.println(100,DEC);
  delay(1000);
  Serial.println(200,DEC);
  Serial.println(30,DEC);
  delay(1000);
  Serial.println(20,DEC);
  Serial.println(100,DEC);
  delay(1000);

  Serial.println(200,DEC);
  Serial.println(300,DEC);
  delay(1000);
  Serial.println(400,DEC);
  Serial.println(700,DEC);
  delay(1000);
  Serial.println(90,DEC);
  Serial.println(900,DEC);
  delay(1000);
  Serial.println(80,DEC);
  Serial.println(800,DEC);
  delay(1000);
  Serial.println(70,DEC);
  Serial.println(700,DEC);
  delay(1000);
  Serial.println(200,DEC);
  Serial.println(500,DEC);
  delay(1000);*/
}


