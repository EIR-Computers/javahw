class ThrowsDemo {
    public void prtMsg(String key) {
        try {
            String msg = keyData(key);
            System.out.println(msg);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public String keyData(String key) {
        if (key == null) {
            throw new NullPointerException("Null key");
        }
        return "data for " + key;
    }
}
