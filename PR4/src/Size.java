
    enum Size {
        XXS(32),
        XS(34),
        S(36),
        M(38),
        L(40);
        private double sz;
        public double getSize() {
            return sz;
        }
        public double getEuroSize() {
            return sz;
        }
        Size(double euroSize) {
            this.sz = euroSize;
        }
        public String getDescription() {
            if (this.equals(Size.XXS)) {
                return "For children";
            } else {
                return "For adult";
            }
        }


    }

