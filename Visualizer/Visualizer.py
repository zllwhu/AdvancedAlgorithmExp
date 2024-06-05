import matplotlib.pyplot as plt
from matplotlib.patches import Circle


class Visualizer:
    def __init__(self, scale_x, scale_y):
        self.scale_x = scale_x
        self.scale_y = scale_y
        self.distributionCenters = [(6, 34), (48, 23), (53, 0), (15, 9), (43, 13), (23, 37), (58, 19), (6, 5), (32, 4), (18, 18)]
        self.dischargePoints = [(52, 15), (49, 28), (46, 21), (28, 6), (25, 11), (40, 17), (24, 30), (30, 4), (48, 30), (35, 3), (49, 4), (15, 5), (13, 37), (23, 19), (19, 36), (4, 39), (32, 1), (15, 27), (14, 37), (7, 13), (46, 24), (39, 4), (16, 26), (54, 11), (23, 15), (33, 6), (30, 39), (8, 37), (17, 20), (23, 28), (54, 11), (16, 3), (11, 32), (13, 31), (1, 2), (15, 35), (58, 14), (19, 38), (3, 5), (44, 3)]

    def plot_map(self):
        # 拆分数据点为x和y坐标
        ax = [location[0] for location in self.distributionCenters]
        ay = [location[1] for location in self.distributionCenters]
        bx = [location[0] for location in self.dischargePoints]
        by = [location[1] for location in self.dischargePoints]
        # 创建绘图区域
        plt.figure(figsize=(9, 6), dpi=300)
        # 绘制配送中心的圆形区域
        for (x, y) in self.distributionCenters:
            circle = Circle((x, y), 10, color='red', alpha=0.1)
            plt.gca().add_patch(circle)
        # 绘制散点
        plt.scatter(ax, ay, color='red', zorder=2, label='Distribution Centers')
        plt.scatter(bx, by, color='blue', zorder=2, label='Discharge Points')
        # 设置标题和坐标轴标签
        plt.title(f"{self.scale_x}x{self.scale_y} Grid Map", fontweight='bold')
        plt.xlabel('X', fontweight='bold')
        plt.ylabel('Y', fontweight='bold')
        # 设置坐标轴范围和刻度
        plt.xlim(0, self.scale_x)
        plt.ylim(0, self.scale_y)
        plt.xticks(range(self.scale_x + 1), fontsize=6)
        plt.yticks(range(self.scale_y + 1), fontsize=6)
        # 设置图例
        plt.legend(loc='lower right')
        # 设置网格
        plt.grid(True, linestyle='--')
        plt.gca().set_aspect('equal')
        plt.gca().invert_yaxis()
        plt.savefig('60x40.png')


if __name__ == '__main__':
    Visualizer(60, 40).plot_map()
