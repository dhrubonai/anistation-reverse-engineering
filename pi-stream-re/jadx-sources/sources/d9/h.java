package d9;

import r6.h0;
import y8.x;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final x f3266a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3267b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3268c;

    public h(x xVar, int i10, String str) {
        this.f3266a = xVar;
        this.f3267b = i10;
        this.f3268c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f3266a == x.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.f3267b);
        sb.append(' ');
        sb.append(this.f3268c);
        String sb2 = sb.toString();
        h0.s(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
