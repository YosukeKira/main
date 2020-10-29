from abc_robot import MazeRobot

class MazeRobotTest(MazeRobot):
	def init_robot(self):
		print("ロボットを初期化します")


robot = MazeRobotTest()
robot.init_robot()
robot.choose_dir()