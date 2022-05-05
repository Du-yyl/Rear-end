
/**
 * time: 2022/5/4 16:37 32
 * ClassName: ExtendsTest03
 * Package: PACKAGE_NAME
 *
 * @author :charlatan
 * <p>
 * Il n'ya qu'un héroïsme au monde : c'est de voir le monde tel qu'il est et de l'aimer.
 */
public class ExtendsTest03 {
    public static void main(String[] args) {
        /*
        SUN 的 Object 源码
        public class Object {
//      这里的方法直接以‘；’结尾，并且修饰符是 native 关键字，表示底层调用 C++ 写的 dll 程序（dll 动态链接库文件）
        private static native void registerNatives();
        static {
            registerNatives();
        }

        @HotSpotIntrinsicCandidate
        public Object() {}

            @HotSpotIntrinsicCandidate
            public final native Class<?> getClass();

            @HotSpotIntrinsicCandidate
            public native int hashCode();

            public boolean equals(Object obj) {
                return (this == obj);
            }

            @HotSpotIntrinsicCandidate
            protected native Object clone() throws CloneNotSupportedException;

            public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
            }

            @HotSpotIntrinsicCandidate
            public final native void notify();

            @HotSpotIntrinsicCandidate
            public final native void notifyAll();

            public final void wait() throws InterruptedException {
                wait(0L);
            }

            public final native void wait(long timeoutMillis) throws InterruptedException;

            public final void wait(long timeoutMillis, int nanos) throws InterruptedException {
                if (timeoutMillis < 0) {
                    throw new IllegalArgumentException("timeoutMillis value is negative");
                }

                if (nanos < 0 || nanos > 999999) {
                    throw new IllegalArgumentException(
                            "nanosecond timeout value out of range");
                }

                if (nanos > 0 && timeoutMillis < Long.MAX_VALUE) {
                    timeoutMillis++;
                }

                wait(timeoutMillis);
            }

            @Deprecated(since="9")
            protected void finalize() throws Throwable { }
        }

         */
    }
}
