package k8;

import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public List f6480a;

    /* renamed from: b, reason: collision with root package name */
    public List f6481b;

    /* renamed from: c, reason: collision with root package name */
    public List f6482c;

    /* renamed from: d, reason: collision with root package name */
    public List f6483d;

    /* renamed from: e, reason: collision with root package name */
    public List f6484e;

    /* renamed from: f, reason: collision with root package name */
    public List f6485f;

    /* renamed from: g, reason: collision with root package name */
    public List f6486g;

    /* renamed from: h, reason: collision with root package name */
    public List f6487h;

    /* renamed from: i, reason: collision with root package name */
    public List f6488i;

    /* renamed from: j, reason: collision with root package name */
    public List f6489j;

    /* renamed from: k, reason: collision with root package name */
    public List f6490k;

    /* renamed from: l, reason: collision with root package name */
    public List f6491l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f6492m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f6493n;

    public a() {
        new HashMap();
        this.f6492m = new HashMap();
        this.f6493n = new HashMap();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a9, code lost:
    
        if (r8.equals("special") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.a.a(java.lang.String):java.util.List");
    }

    public final void b(String str, List list) {
        this.f6493n.put(str, Long.valueOf(System.currentTimeMillis()));
        char c6 = 65535;
        switch (str.hashCode()) {
            case -2008465223:
                if (str.equals("special")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1068259517:
                if (str.equals("movies")) {
                    c6 = 1;
                    break;
                }
                break;
            case -919958188:
                if (str.equals("spotlight")) {
                    c6 = 2;
                    break;
                }
                break;
            case -393940263:
                if (str.equals("popular")) {
                    c6 = 3;
                    break;
                }
                break;
            case 3714:
                if (str.equals("tv")) {
                    c6 = 4;
                    break;
                }
                break;
            case 101139:
                if (str.equals("fan")) {
                    c6 = 5;
                    break;
                }
                break;
            case 108960:
                if (str.equals("new")) {
                    c6 = 6;
                    break;
                }
                break;
            case 110178:
                if (str.equals("ona")) {
                    c6 = 7;
                    break;
                }
                break;
            case 110426:
                if (str.equals("ova")) {
                    c6 = '\b';
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c6 = '\t';
                    break;
                }
                break;
            case 1856346911:
                if (str.equals("upcomingSeason")) {
                    c6 = '\n';
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                this.f6489j = list;
                return;
            case 1:
                this.f6486g = list;
                return;
            case 2:
                this.f6484e = list;
                return;
            case 3:
                this.f6485f = list;
                return;
            case 4:
                this.f6490k = list;
                return;
            case 5:
                this.f6483d = list;
                return;
            case 6:
                this.f6481b = list;
                return;
            case zzaja.zze.zzg /* 7 */:
                this.f6487h = list;
                return;
            case '\b':
                this.f6488i = list;
                return;
            case '\t':
                this.f6480a = list;
                return;
            case '\n':
                this.f6491l = list;
                return;
            default:
                return;
        }
    }
}
