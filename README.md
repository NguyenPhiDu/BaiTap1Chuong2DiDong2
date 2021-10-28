# BaiTap1Chuong2DiDong2
B1 : Cài đặt thư viên
implementation 'com.squareup.retrofit2:retrofit:2.1.0'
implementation 'com.squareup.retrofit2:converter-gson:2.1.0'


Bỏ đến Grandle Scripts -> build.gradle Model rồi bỏ trong hàm dependencies()
Sau đó nhấn vào sync now

B2: Gán quyền cho nó copy vô file AndroidManifest.xml
<uses-permission android:name="android.permission.INTERNET" />

B3: Tạo Class Model
Gồm có 4 thuộc tính login, id, avatar_url, url;

Tạo một model không tham số ,model có tham số,
getter và setter ,toString

 
 
B4 :Tạo class Interface githubApi
 

B5 : Gọi lệnh API trong MainActivity

final GitHubApi gitHubApi = GitHubApi.retrofit.create(GitHubApi.class);

Sau đó nhấn : Call.enqueue(new sẽ ra được onRespone và onFailure
 

B6 : Tạo listview_item bên Layout với @id là lvHienThi
 




B7 : Tạo một layout hiển thị login, id, avatar_url, url
 
B8 : Gọi listview và ánh xạ bên MainActivity
 
Tạo SetControl(); , SetEvent(); nhấn Alt + Enter
 
 
 Xử lý hình ảnh bằng Picasso
implementation 'com.squareup.picasso:picasso:2.71828'
Bỏ đến Grandle Scripts -> build.gradle Model rồi bỏ trong hàm dependencies()
Sau đó nhấn vào sync now
B9 : Tạo customAdapter
Để trỏ chuột vào ArrayAdapter rồi nhấn Alt+Enter để ra các hàm
 
B10: Tạo data
List<UserModel> userlist = response.body();

Xử lý dữ liệu viết trong hàm onResponse
 
