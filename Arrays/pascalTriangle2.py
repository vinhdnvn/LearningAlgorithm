from ast import List
class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        output = [1]
        for i in range(1, rowIndex+1):
            output.append(1)
            for j in range( len(output)-2, 0, -1):
                output[j] += output[j-1]
        
        return output



#          [1]
#         [1, 1]
#       [1, 2, 1]
#      [1, 3, 3, 1]
#    [1, 4, 6, 4, 1]
    
# Đưa về cùng 1 hàng coi như các array cho dễ hình dung
# [1]
# [1, 1]
# [1, 2, 1]
# [1, 3, 3, 1]
# [1, 4, 6, 4, 1]
# dễ dàng nhận thấy rằng mỗi index kế tiếp index đầu tiên của 1 rows sẽ tăng lên 1 đơn vị
# và index cuối cùng của 1 rows sẽ luôn là 1
# còn giữa 2 index đầu và cuối sẽ là tổng của 2 index trên nó
# nên ta chỉ cần append 1 vào cuối mỗi rows và tính toán từ index cuối về index 1
# và cứ như vậy cho đến khi đủ số hàng rowIndex
