fun main() {
  
  
  // Nilai Benar  
  if(true){
    println("Yeayyy bernilai benar")
  }

  // Nilai Salah
  if(false){
    println("Saya tidak akan ditampilkan")
  }

  // Nilai Salah
  var lapar = true
  if(lapar){
    println("Wayyy saya laparr")
  }

  // Pengecekan Kondisi menggunakan variabel
  var nama_1 = "Johny"
  if(nama_1 == "Johny"){
    println("Halo Saya Johny")
  } 

  // Pengecekan kondisi menggunkakan variabel
  var nama_2 = "Andre"
  if(nama_2 != "Andre"){
    println("Saya bukan andreeee")
  }

  // Various of logic
  var kondisi_1 = true
  var kondisi_2 = true
  if(kondisi_1 && kondisi_2){
    println("Kondisi DAN terpenuhi")
  }

  var kondisi_3 = true
  var kondisi_4 = false
  if(kondisi_3 || kondisi_4){
    println("Kondisi OR terpenuhi")
  }

  // If-Else
  var kondisi_5 = false
  if(kondisi_5){
    println("Kondisi If terpenuhi")
  }
  else{
    println("Oops, nampaknya kondisi if salah")
  }

  // If-Else (2)
  var kondisi_6 = "zredhard"
  if(kondisi_6 == "zredhard"){
    println("Halo, zredhard")
  }
  else{
    println("Oops, anda bukan zredhard")
  }

  // If-Else (3)
  if(false){
    println("Kondisi ini tidak akan berjalan")
  }
  else{
    println("Saya yang akan berjalan")
  }

  // Latihan If dan Else If
  var nilai = 50
  if(nilai > 80){
    println("Anda mendapat nilai A")
  }
  else if(nilai > 60){
    println("Anda mendapat nilai B")
  }
  else if(nilai > 40){
    println("Anda mendapat nilai C")
  }
  else{
    println("Anda tidak lulus")
  }

  // Latihan If dan Else If
  nilai = 90
  if(nilai > 80){
    println("Anda mendapat nilai A")
  }
  else if(nilai > 60){
    println("Anda mendapat nilai B")
  }
  else if(nilai > 40){
    println("Anda mendapat nilai C")
  }
  else{
    println("Anda tidak lulus")
  }


}