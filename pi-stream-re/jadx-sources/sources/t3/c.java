package t3;

import java.io.File;
import o1.d0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f9997a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f9998b;

    /* renamed from: c, reason: collision with root package name */
    public final File[] f9999c;

    /* renamed from: d, reason: collision with root package name */
    public final File[] f10000d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10001e;

    /* renamed from: f, reason: collision with root package name */
    public d0 f10002f;

    /* renamed from: g, reason: collision with root package name */
    public long f10003g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f10004h;

    public c(e eVar, String str) {
        this.f10004h = eVar;
        this.f9997a = str;
        int i10 = eVar.f10016x;
        this.f9998b = new long[i10];
        this.f9999c = new File[i10];
        this.f10000d = new File[i10];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i11 = 0; i11 < eVar.f10016x; i11++) {
            sb.append(i11);
            File[] fileArr = this.f9999c;
            String sb2 = sb.toString();
            File file = eVar.f10010a;
            fileArr[i11] = new File(file, sb2);
            sb.append(".tmp");
            this.f10000d[i11] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j4 : this.f9998b) {
            sb.append(' ');
            sb.append(j4);
        }
        return sb.toString();
    }
}
