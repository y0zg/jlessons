package EnumInClass;


	public enum ShapeType {
		DOT,
		LINE,
		TRIANGLE,
		SQUARE;

		private ShapeType(){

		}

		@Override
		public String toString(){
			return " dots: "+(this.ordinal()+1);//starts with 0
		}
	}