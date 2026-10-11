package g3;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: f, reason: collision with root package name */
    public int f4350f;

    /* renamed from: h, reason: collision with root package name */
    public int f4352h;
    public float o;

    /* renamed from: a, reason: collision with root package name */
    public String f4345a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f4346b = "";

    /* renamed from: c, reason: collision with root package name */
    public Set f4347c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    public String f4348d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f4349e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4351g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4353i = false;

    /* renamed from: j, reason: collision with root package name */
    public final int f4354j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f4355k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f4356l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f4357m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f4358n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f4359p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4360q = false;

    public static int a(String str, int i10, int i11, String str2) {
        if (!str.isEmpty() && i10 != -1) {
            if (!str.equals(str2)) {
                return -1;
            }
            return i10 + i11;
        }
        return i10;
    }
}
