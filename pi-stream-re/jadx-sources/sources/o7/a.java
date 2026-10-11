package o7;

import java.nio.charset.Charset;
import r6.h0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f8311a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile Charset f8312b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile Charset f8313c;

    static {
        Charset forName = Charset.forName("UTF-8");
        h0.s(forName, "forName(...)");
        f8311a = forName;
        h0.s(Charset.forName("UTF-16"), "forName(...)");
        h0.s(Charset.forName("UTF-16BE"), "forName(...)");
        h0.s(Charset.forName("UTF-16LE"), "forName(...)");
        h0.s(Charset.forName("US-ASCII"), "forName(...)");
        h0.s(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
