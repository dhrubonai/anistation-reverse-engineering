package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s25 {
    public static final zk3 k = new zk3("RemoteMediaClient", null);
    public final qk7 c;
    public final xf6 d;
    public final nq3 e;
    public sm7 f;
    public final CopyOnWriteArrayList g = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList h = new CopyOnWriteArrayList();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public final Object a = new Object();
    public final h15 b = new h15(Looper.getMainLooper(), (byte) 4);

    static {
        String str = qk7.A;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [nq3, java.lang.Object] */
    public s25(qk7 qk7Var) {
        xf6 xf6Var = new xf6(this);
        this.d = xf6Var;
        this.c = qk7Var;
        qk7Var.h = new fq3((Object) this, (byte) 25);
        qk7Var.c = xf6Var;
        ?? obj = new Object();
        obj.m = Collections.synchronizedSet(new HashSet());
        obj.b = new zk3("MediaQueue", null);
        obj.c = this;
        obj.d = new ArrayList();
        obj.e = new SparseIntArray();
        obj.g = new ArrayList();
        obj.h = new ArrayDeque(20);
        obj.i = new h15(Looper.getMainLooper(), (byte) 4);
        byte b = 1;
        obj.j = new gm7(obj, b);
        p(new k27(obj, b));
        obj.f = new lw7(obj);
        obj.a = obj.g();
        obj.e();
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.internal.BasePendingResult, jl7] */
    public static jl7 w() {
        ?? basePendingResult = new BasePendingResult();
        basePendingResult.e(new hl7((jl7) basePendingResult, new Status(17, null, null, null)));
        return basePendingResult;
    }

    public static final void z(am7 am7Var) {
        try {
            am7Var.k();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            am7Var.e(new hl7(am7Var, new Status(2100, null, null, null)));
        }
    }

    public final long a() {
        long o;
        synchronized (this.a) {
            a34.s();
            o = this.c.o();
        }
        return o;
    }

    public final ur3 b() {
        a34.s();
        bx3 e = e();
        if (e == null) {
            return null;
        }
        return e.c(e.I);
    }

    public final MediaInfo c() {
        MediaInfo mediaInfo;
        synchronized (this.a) {
            a34.s();
            bx3 bx3Var = this.c.f;
            if (bx3Var == null) {
                mediaInfo = null;
            } else {
                mediaInfo = bx3Var.x;
            }
        }
        return mediaInfo;
    }

    public final nq3 d() {
        nq3 nq3Var;
        synchronized (this.a) {
            a34.s();
            nq3Var = this.e;
        }
        return nq3Var;
    }

    public final bx3 e() {
        bx3 bx3Var;
        synchronized (this.a) {
            a34.s();
            bx3Var = this.c.f;
        }
        return bx3Var;
    }

    public final int f() {
        int i;
        synchronized (this.a) {
            try {
                a34.s();
                bx3 e = e();
                if (e != null) {
                    i = e.B;
                } else {
                    i = 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final long g() {
        MediaInfo mediaInfo;
        long j;
        synchronized (this.a) {
            a34.s();
            bx3 bx3Var = this.c.f;
            if (bx3Var == null) {
                mediaInfo = null;
            } else {
                mediaInfo = bx3Var.x;
            }
            if (mediaInfo != null) {
                j = mediaInfo.B;
            } else {
                j = 0;
            }
        }
        return j;
    }

    public final boolean h() {
        a34.s();
        if (!i() && !u() && !m() && !l() && !k()) {
            return false;
        }
        return true;
    }

    public final boolean i() {
        a34.s();
        bx3 e = e();
        if (e != null && e.B == 4) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        a34.s();
        MediaInfo c = c();
        if (c != null && c.y == 2) {
            return true;
        }
        return false;
    }

    public final boolean k() {
        a34.s();
        bx3 e = e();
        if (e != null && e.I != 0) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        int i;
        a34.s();
        bx3 e = e();
        if (e != null) {
            if (e.B != 3) {
                if (j()) {
                    synchronized (this.a) {
                        try {
                            a34.s();
                            bx3 e2 = e();
                            if (e2 != null) {
                                i = e2.C;
                            } else {
                                i = 0;
                            }
                        } finally {
                        }
                    }
                    if (i == 2) {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        a34.s();
        bx3 e = e();
        if (e != null && e.B == 2) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        a34.s();
        bx3 e = e();
        if (e != null && e.O) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x017f, code lost:
    
        if (r11 != false) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8 A[Catch: JSONException -> 0x0075, TryCatch #0 {JSONException -> 0x0075, blocks: (B:3:0x0019, B:8:0x0043, B:10:0x004f, B:12:0x0059, B:13:0x0065, B:15:0x006b, B:24:0x0080, B:26:0x008c, B:28:0x009d, B:33:0x00b8, B:36:0x00bd, B:37:0x0100, B:39:0x0104, B:40:0x0110, B:42:0x0114, B:43:0x011c, B:45:0x0120, B:46:0x0126, B:48:0x012a, B:49:0x012d, B:51:0x0131, B:52:0x0134, B:54:0x0138, B:55:0x013b, B:57:0x013f, B:59:0x0149, B:61:0x0159, B:62:0x015f, B:64:0x0165, B:66:0x016f, B:67:0x0173, B:68:0x0174, B:70:0x0178, B:71:0x0181, B:72:0x0193, B:73:0x0197, B:75:0x019d, B:81:0x00c2, B:82:0x00a6, B:84:0x00ae, B:88:0x0185, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01da, B:103:0x01e6, B:105:0x01fa, B:109:0x020b, B:110:0x0217, B:112:0x021d, B:118:0x022f, B:120:0x0244, B:121:0x0263, B:123:0x0269, B:126:0x0273, B:127:0x027f, B:129:0x0285, B:135:0x0297, B:136:0x02a3, B:138:0x02a9, B:144:0x02bb, B:145:0x02c7, B:147:0x02cd, B:157:0x02df, B:158:0x02e3, B:160:0x02e9, B:162:0x02f7, B:164:0x02fb, B:165:0x030b, B:167:0x0311, B:174:0x0323, B:179:0x0333, B:180:0x0342, B:182:0x0348, B:188:0x0360, B:192:0x036d, B:193:0x0379, B:195:0x037f, B:197:0x0391, B:198:0x039d, B:200:0x03a3, B:206:0x03b5), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0104 A[Catch: JSONException -> 0x0075, TryCatch #0 {JSONException -> 0x0075, blocks: (B:3:0x0019, B:8:0x0043, B:10:0x004f, B:12:0x0059, B:13:0x0065, B:15:0x006b, B:24:0x0080, B:26:0x008c, B:28:0x009d, B:33:0x00b8, B:36:0x00bd, B:37:0x0100, B:39:0x0104, B:40:0x0110, B:42:0x0114, B:43:0x011c, B:45:0x0120, B:46:0x0126, B:48:0x012a, B:49:0x012d, B:51:0x0131, B:52:0x0134, B:54:0x0138, B:55:0x013b, B:57:0x013f, B:59:0x0149, B:61:0x0159, B:62:0x015f, B:64:0x0165, B:66:0x016f, B:67:0x0173, B:68:0x0174, B:70:0x0178, B:71:0x0181, B:72:0x0193, B:73:0x0197, B:75:0x019d, B:81:0x00c2, B:82:0x00a6, B:84:0x00ae, B:88:0x0185, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01da, B:103:0x01e6, B:105:0x01fa, B:109:0x020b, B:110:0x0217, B:112:0x021d, B:118:0x022f, B:120:0x0244, B:121:0x0263, B:123:0x0269, B:126:0x0273, B:127:0x027f, B:129:0x0285, B:135:0x0297, B:136:0x02a3, B:138:0x02a9, B:144:0x02bb, B:145:0x02c7, B:147:0x02cd, B:157:0x02df, B:158:0x02e3, B:160:0x02e9, B:162:0x02f7, B:164:0x02fb, B:165:0x030b, B:167:0x0311, B:174:0x0323, B:179:0x0333, B:180:0x0342, B:182:0x0348, B:188:0x0360, B:192:0x036d, B:193:0x0379, B:195:0x037f, B:197:0x0391, B:198:0x039d, B:200:0x03a3, B:206:0x03b5), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0114 A[Catch: JSONException -> 0x0075, TryCatch #0 {JSONException -> 0x0075, blocks: (B:3:0x0019, B:8:0x0043, B:10:0x004f, B:12:0x0059, B:13:0x0065, B:15:0x006b, B:24:0x0080, B:26:0x008c, B:28:0x009d, B:33:0x00b8, B:36:0x00bd, B:37:0x0100, B:39:0x0104, B:40:0x0110, B:42:0x0114, B:43:0x011c, B:45:0x0120, B:46:0x0126, B:48:0x012a, B:49:0x012d, B:51:0x0131, B:52:0x0134, B:54:0x0138, B:55:0x013b, B:57:0x013f, B:59:0x0149, B:61:0x0159, B:62:0x015f, B:64:0x0165, B:66:0x016f, B:67:0x0173, B:68:0x0174, B:70:0x0178, B:71:0x0181, B:72:0x0193, B:73:0x0197, B:75:0x019d, B:81:0x00c2, B:82:0x00a6, B:84:0x00ae, B:88:0x0185, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01da, B:103:0x01e6, B:105:0x01fa, B:109:0x020b, B:110:0x0217, B:112:0x021d, B:118:0x022f, B:120:0x0244, B:121:0x0263, B:123:0x0269, B:126:0x0273, B:127:0x027f, B:129:0x0285, B:135:0x0297, B:136:0x02a3, B:138:0x02a9, B:144:0x02bb, B:145:0x02c7, B:147:0x02cd, B:157:0x02df, B:158:0x02e3, B:160:0x02e9, B:162:0x02f7, B:164:0x02fb, B:165:0x030b, B:167:0x0311, B:174:0x0323, B:179:0x0333, B:180:0x0342, B:182:0x0348, B:188:0x0360, B:192:0x036d, B:193:0x0379, B:195:0x037f, B:197:0x0391, B:198:0x039d, B:200:0x03a3, B:206:0x03b5), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120 A[Catch: JSONException -> 0x0075, TryCatch #0 {JSONException -> 0x0075, blocks: (B:3:0x0019, B:8:0x0043, B:10:0x004f, B:12:0x0059, B:13:0x0065, B:15:0x006b, B:24:0x0080, B:26:0x008c, B:28:0x009d, B:33:0x00b8, B:36:0x00bd, B:37:0x0100, B:39:0x0104, B:40:0x0110, B:42:0x0114, B:43:0x011c, B:45:0x0120, B:46:0x0126, B:48:0x012a, B:49:0x012d, B:51:0x0131, B:52:0x0134, B:54:0x0138, B:55:0x013b, B:57:0x013f, B:59:0x0149, B:61:0x0159, B:62:0x015f, B:64:0x0165, B:66:0x016f, B:67:0x0173, B:68:0x0174, B:70:0x0178, B:71:0x0181, B:72:0x0193, B:73:0x0197, B:75:0x019d, B:81:0x00c2, B:82:0x00a6, B:84:0x00ae, B:88:0x0185, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01da, B:103:0x01e6, B:105:0x01fa, B:109:0x020b, B:110:0x0217, B:112:0x021d, B:118:0x022f, B:120:0x0244, B:121:0x0263, B:123:0x0269, B:126:0x0273, B:127:0x027f, B:129:0x0285, B:135:0x0297, B:136:0x02a3, B:138:0x02a9, B:144:0x02bb, B:145:0x02c7, B:147:0x02cd, B:157:0x02df, B:158:0x02e3, B:160:0x02e9, B:162:0x02f7, B:164:0x02fb, B:165:0x030b, B:167:0x0311, B:174:0x0323, B:179:0x0333, B:180:0x0342, B:182:0x0348, B:188:0x0360, B:192:0x036d, B:193:0x0379, B:195:0x037f, B:197:0x0391, B:198:0x039d, B:200:0x03a3, B:206:0x03b5), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a A[Catch: JSONException -> 0x0075, TryCatch #0 {JSONException -> 0x0075, blocks: (B:3:0x0019, B:8:0x0043, B:10:0x004f, B:12:0x0059, B:13:0x0065, B:15:0x006b, B:24:0x0080, B:26:0x008c, B:28:0x009d, B:33:0x00b8, B:36:0x00bd, B:37:0x0100, B:39:0x0104, B:40:0x0110, B:42:0x0114, B:43:0x011c, B:45:0x0120, B:46:0x0126, B:48:0x012a, B:49:0x012d, B:51:0x0131, B:52:0x0134, B:54:0x0138, B:55:0x013b, B:57:0x013f, B:59:0x0149, B:61:0x0159, B:62:0x015f, B:64:0x0165, B:66:0x016f, B:67:0x0173, B:68:0x0174, B:70:0x0178, B:71:0x0181, B:72:0x0193, B:73:0x0197, B:75:0x019d, B:81:0x00c2, B:82:0x00a6, B:84:0x00ae, B:88:0x0185, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01da, B:103:0x01e6, B:105:0x01fa, B:109:0x020b, B:110:0x0217, B:112:0x021d, B:118:0x022f, B:120:0x0244, B:121:0x0263, B:123:0x0269, B:126:0x0273, B:127:0x027f, B:129:0x0285, B:135:0x0297, B:136:0x02a3, B:138:0x02a9, B:144:0x02bb, B:145:0x02c7, B:147:0x02cd, B:157:0x02df, B:158:0x02e3, B:160:0x02e9, B:162:0x02f7, B:164:0x02fb, B:165:0x030b, B:167:0x0311, B:174:0x0323, B:179:0x0333, B:180:0x0342, B:182:0x0348, B:188:0x0360, B:192:0x036d, B:193:0x0379, B:195:0x037f, B:197:0x0391, B:198:0x039d, B:200:0x03a3, B:206:0x03b5), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131 A[Catch: JSONException -> 0x0075, TryCatch #0 {JSONException -> 0x0075, blocks: (B:3:0x0019, B:8:0x0043, B:10:0x004f, B:12:0x0059, B:13:0x0065, B:15:0x006b, B:24:0x0080, B:26:0x008c, B:28:0x009d, B:33:0x00b8, B:36:0x00bd, B:37:0x0100, B:39:0x0104, B:40:0x0110, B:42:0x0114, B:43:0x011c, B:45:0x0120, B:46:0x0126, B:48:0x012a, B:49:0x012d, B:51:0x0131, B:52:0x0134, B:54:0x0138, B:55:0x013b, B:57:0x013f, B:59:0x0149, B:61:0x0159, B:62:0x015f, B:64:0x0165, B:66:0x016f, B:67:0x0173, B:68:0x0174, B:70:0x0178, B:71:0x0181, B:72:0x0193, B:73:0x0197, B:75:0x019d, B:81:0x00c2, B:82:0x00a6, B:84:0x00ae, B:88:0x0185, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01da, B:103:0x01e6, B:105:0x01fa, B:109:0x020b, B:110:0x0217, B:112:0x021d, B:118:0x022f, B:120:0x0244, B:121:0x0263, B:123:0x0269, B:126:0x0273, B:127:0x027f, B:129:0x0285, B:135:0x0297, B:136:0x02a3, B:138:0x02a9, B:144:0x02bb, B:145:0x02c7, B:147:0x02cd, B:157:0x02df, B:158:0x02e3, B:160:0x02e9, B:162:0x02f7, B:164:0x02fb, B:165:0x030b, B:167:0x0311, B:174:0x0323, B:179:0x0333, B:180:0x0342, B:182:0x0348, B:188:0x0360, B:192:0x036d, B:193:0x0379, B:195:0x037f, B:197:0x0391, B:198:0x039d, B:200:0x03a3, B:206:0x03b5), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0138 A[Catch: JSONException -> 0x0075, TryCatch #0 {JSONException -> 0x0075, blocks: (B:3:0x0019, B:8:0x0043, B:10:0x004f, B:12:0x0059, B:13:0x0065, B:15:0x006b, B:24:0x0080, B:26:0x008c, B:28:0x009d, B:33:0x00b8, B:36:0x00bd, B:37:0x0100, B:39:0x0104, B:40:0x0110, B:42:0x0114, B:43:0x011c, B:45:0x0120, B:46:0x0126, B:48:0x012a, B:49:0x012d, B:51:0x0131, B:52:0x0134, B:54:0x0138, B:55:0x013b, B:57:0x013f, B:59:0x0149, B:61:0x0159, B:62:0x015f, B:64:0x0165, B:66:0x016f, B:67:0x0173, B:68:0x0174, B:70:0x0178, B:71:0x0181, B:72:0x0193, B:73:0x0197, B:75:0x019d, B:81:0x00c2, B:82:0x00a6, B:84:0x00ae, B:88:0x0185, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01da, B:103:0x01e6, B:105:0x01fa, B:109:0x020b, B:110:0x0217, B:112:0x021d, B:118:0x022f, B:120:0x0244, B:121:0x0263, B:123:0x0269, B:126:0x0273, B:127:0x027f, B:129:0x0285, B:135:0x0297, B:136:0x02a3, B:138:0x02a9, B:144:0x02bb, B:145:0x02c7, B:147:0x02cd, B:157:0x02df, B:158:0x02e3, B:160:0x02e9, B:162:0x02f7, B:164:0x02fb, B:165:0x030b, B:167:0x0311, B:174:0x0323, B:179:0x0333, B:180:0x0342, B:182:0x0348, B:188:0x0360, B:192:0x036d, B:193:0x0379, B:195:0x037f, B:197:0x0391, B:198:0x039d, B:200:0x03a3, B:206:0x03b5), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013f A[Catch: JSONException -> 0x0075, TryCatch #0 {JSONException -> 0x0075, blocks: (B:3:0x0019, B:8:0x0043, B:10:0x004f, B:12:0x0059, B:13:0x0065, B:15:0x006b, B:24:0x0080, B:26:0x008c, B:28:0x009d, B:33:0x00b8, B:36:0x00bd, B:37:0x0100, B:39:0x0104, B:40:0x0110, B:42:0x0114, B:43:0x011c, B:45:0x0120, B:46:0x0126, B:48:0x012a, B:49:0x012d, B:51:0x0131, B:52:0x0134, B:54:0x0138, B:55:0x013b, B:57:0x013f, B:59:0x0149, B:61:0x0159, B:62:0x015f, B:64:0x0165, B:66:0x016f, B:67:0x0173, B:68:0x0174, B:70:0x0178, B:71:0x0181, B:72:0x0193, B:73:0x0197, B:75:0x019d, B:81:0x00c2, B:82:0x00a6, B:84:0x00ae, B:88:0x0185, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01da, B:103:0x01e6, B:105:0x01fa, B:109:0x020b, B:110:0x0217, B:112:0x021d, B:118:0x022f, B:120:0x0244, B:121:0x0263, B:123:0x0269, B:126:0x0273, B:127:0x027f, B:129:0x0285, B:135:0x0297, B:136:0x02a3, B:138:0x02a9, B:144:0x02bb, B:145:0x02c7, B:147:0x02cd, B:157:0x02df, B:158:0x02e3, B:160:0x02e9, B:162:0x02f7, B:164:0x02fb, B:165:0x030b, B:167:0x0311, B:174:0x0323, B:179:0x0333, B:180:0x0342, B:182:0x0348, B:188:0x0360, B:192:0x036d, B:193:0x0379, B:195:0x037f, B:197:0x0391, B:198:0x039d, B:200:0x03a3, B:206:0x03b5), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0178 A[Catch: JSONException -> 0x0075, TryCatch #0 {JSONException -> 0x0075, blocks: (B:3:0x0019, B:8:0x0043, B:10:0x004f, B:12:0x0059, B:13:0x0065, B:15:0x006b, B:24:0x0080, B:26:0x008c, B:28:0x009d, B:33:0x00b8, B:36:0x00bd, B:37:0x0100, B:39:0x0104, B:40:0x0110, B:42:0x0114, B:43:0x011c, B:45:0x0120, B:46:0x0126, B:48:0x012a, B:49:0x012d, B:51:0x0131, B:52:0x0134, B:54:0x0138, B:55:0x013b, B:57:0x013f, B:59:0x0149, B:61:0x0159, B:62:0x015f, B:64:0x0165, B:66:0x016f, B:67:0x0173, B:68:0x0174, B:70:0x0178, B:71:0x0181, B:72:0x0193, B:73:0x0197, B:75:0x019d, B:81:0x00c2, B:82:0x00a6, B:84:0x00ae, B:88:0x0185, B:92:0x01af, B:93:0x01be, B:95:0x01c4, B:101:0x01da, B:103:0x01e6, B:105:0x01fa, B:109:0x020b, B:110:0x0217, B:112:0x021d, B:118:0x022f, B:120:0x0244, B:121:0x0263, B:123:0x0269, B:126:0x0273, B:127:0x027f, B:129:0x0285, B:135:0x0297, B:136:0x02a3, B:138:0x02a9, B:144:0x02bb, B:145:0x02c7, B:147:0x02cd, B:157:0x02df, B:158:0x02e3, B:160:0x02e9, B:162:0x02f7, B:164:0x02fb, B:165:0x030b, B:167:0x0311, B:174:0x0323, B:179:0x0333, B:180:0x0342, B:182:0x0348, B:188:0x0360, B:192:0x036d, B:193:0x0379, B:195:0x037f, B:197:0x0391, B:198:0x039d, B:200:0x03a3, B:206:0x03b5), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.lang.String r44) {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s25.o(java.lang.String):void");
    }

    public final void p(r25 r25Var) {
        a34.s();
        if (r25Var != null) {
            this.h.add(r25Var);
        }
    }

    public final void q() {
        a34.s();
        int f = f();
        if (f != 4 && f != 2) {
            a34.s();
            if (!x()) {
                w();
                return;
            } else {
                z(new sf7(this, (byte) 5, false));
                return;
            }
        }
        a34.s();
        if (!x()) {
            w();
        } else {
            z(new sf7(this, (byte) 3, false));
        }
    }

    public final void r(r25 r25Var) {
        a34.s();
        if (r25Var != null) {
            this.h.remove(r25Var);
        }
    }

    public final void s(sm7 sm7Var) {
        s25 s25Var;
        sm7 sm7Var2 = this.f;
        if (sm7Var2 != sm7Var) {
            if (sm7Var2 != null) {
                qk7 qk7Var = this.c;
                List list = qk7Var.d;
                synchronized (list) {
                    try {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((bl7) it.next()).e(2002);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                qk7Var.j();
                this.e.d();
                a34.s();
                String str = this.c.b;
                if (!TextUtils.isEmpty(str)) {
                    HashMap hashMap = sm7Var2.C;
                    synchronized (hashMap) {
                        s25Var = (s25) hashMap.remove(str);
                    }
                    o76 b = o76.b();
                    b.d = new xf6(sm7Var2, s25Var, str, (byte) 6);
                    b.c = (short) 8414;
                    sm7Var2.d(1, b.a());
                    this.d.y = null;
                    this.b.removeCallbacksAndMessages(null);
                } else {
                    ze0.k("Channel namespace cannot be null or empty");
                    return;
                }
            }
            this.f = sm7Var;
            if (sm7Var != null) {
                this.d.y = sm7Var;
            }
        }
    }

    public final void t() {
        sm7 sm7Var = this.f;
        if (sm7Var == null) {
            return;
        }
        a34.s();
        String str = this.c.b;
        qi0.b(str);
        HashMap hashMap = sm7Var.C;
        synchronized (hashMap) {
            hashMap.put(str, this);
        }
        o76 b = o76.b();
        b.d = new l87(sm7Var, str, this, (byte) 5);
        b.c = (short) 8413;
        sm7Var.d(1, b.a());
        a34.s();
        if (!x()) {
            w();
        } else {
            z(new sf7(this, (byte) 6));
        }
    }

    public final boolean u() {
        a34.s();
        bx3 e = e();
        if (e != null && e.B == 5) {
            return true;
        }
        return false;
    }

    public final int v() {
        ur3 b;
        if (c() != null && h()) {
            if (i()) {
                return 6;
            }
            if (m()) {
                return 3;
            }
            if (l()) {
                return 2;
            }
            if (k() && (b = b()) != null && b.x != null) {
                return 6;
            }
        }
        return 0;
    }

    public final boolean x() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public final void y(Set set) {
        HashSet hashSet = new HashSet(set);
        if (!m() && !l() && !i() && !u()) {
            if (k()) {
                ur3 b = b();
                if (b != null && b.x != null) {
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((o25) it.next()).a.D = 0L;
                    }
                    return;
                }
                return;
            }
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ((o25) it2.next()).a.D = 0L;
            }
            return;
        }
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            o25 o25Var = (o25) it3.next();
            long a = a();
            g();
            o25Var.a.D = a;
        }
    }
}
