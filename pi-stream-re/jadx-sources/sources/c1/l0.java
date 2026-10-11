package c1;

import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f1799a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public static String f1800b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f1799a.add(str)) {
                f1800b += ", " + str;
            }
        }
    }
}
