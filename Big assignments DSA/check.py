import filecmp

def compare_files(file1_path, file2_path,n):
    # Sử dụng hàm filecmp.cmp để so sánh hai file
    are_files_equal = filecmp.cmp(file1_path, file2_path, shallow=False)
    print("Check : ", n )
    if are_files_equal:
        print("Hai file giống nhau.")
    else:
        print("Hai file khác nhau.")

# Đường dẫn đến thư mục chứa các file
folder_path = "output/"
expected_folder_path = "expected_output/"

# Nhập số từ người dùng

# Kiểm tra xem số nhập vào có nằm trong khoảng từ 1 đến 7 không
for n in range(1,8):
    # Tạo đường dẫn của hai file dựa trên số nhập vào
    file1_path = f"{folder_path}Req{n}.txt"
    file2_path = f"{expected_folder_path}Req{n}.txt"
    compare_files(file1_path, file2_path,n)
