package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.net.Inet4Address;
import java.net.ServerSocket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ci0 implements Closeable {
    public final ConcurrentHashMap A;
    public final ConcurrentHashMap B;
    public final ExecutorService C;
    public final ExecutorService D;
    public final AtomicBoolean E;
    public volatile ai0 F;
    public final jd4 x;
    public final ConcurrentHashMap.KeySetView y;
    public final ConnectivityManager z;

    public ci0(Context context, jd4 jd4Var) {
        Context applicationContext = context.getApplicationContext();
        id4 a = jd4Var.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        a.w = dq6.b(10L, timeUnit);
        this.x = new jd4(a);
        this.y = ConcurrentHashMap.newKeySet();
        this.z = (ConnectivityManager) applicationContext.getSystemService(ConnectivityManager.class);
        this.A = new ConcurrentHashMap();
        this.B = new ConcurrentHashMap();
        this.C = Executors.newSingleThreadExecutor();
        this.D = Executors.newFixedThreadPool(8);
        this.E = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String I(defpackage.ci0 r7, defpackage.ai0 r8, defpackage.bi0 r9, java.lang.String r10, boolean r11, defpackage.ni0 r12, int r13) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci0.I(ci0, ai0, bi0, java.lang.String, boolean, ni0, int):java.lang.String");
    }

    public static an3 T(BufferedInputStream bufferedInputStream) {
        an3 an3Var = new an3();
        while (true) {
            String d0 = d0(bufferedInputStream);
            if (d0 != null && d0.length() != 0) {
                int S = uz5.S(d0, ':', 0, 6);
                if (S > 0) {
                    String lowerCase = uz5.w0(d0.substring(0, S)).toString().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    an3Var.put(lowerCase, uz5.w0(d0.substring(S + 1)).toString());
                }
            }
        }
        return an3Var.b();
    }

    public static String d0(BufferedInputStream bufferedInputStream) {
        ArrayList arrayList = new ArrayList();
        while (arrayList.size() < 16384) {
            int read = bufferedInputStream.read();
            if (read == -1) {
                if (arrayList.isEmpty()) {
                    return null;
                }
                byte[] F0 = yo0.F0(arrayList);
                Charset charset = StandardCharsets.ISO_8859_1;
                charset.getClass();
                return new String(F0, charset);
            }
            if (read == 10) {
                break;
            }
            if (read != 13) {
                arrayList.add(Byte.valueOf((byte) read));
            }
        }
        byte[] F02 = yo0.F0(arrayList);
        Charset charset2 = StandardCharsets.ISO_8859_1;
        charset2.getClass();
        return new String(F02, charset2);
    }

    public static void k0(BufferedOutputStream bufferedOutputStream, int i, String str) {
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        Map singletonMap = Collections.singletonMap("Content-Type", "text/plain; charset=utf-8");
        singletonMap.getClass();
        l0(bufferedOutputStream, i, str, singletonMap, Long.valueOf(bytes.length));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
    }

    public static void l0(BufferedOutputStream bufferedOutputStream, int i, String str, Map map, Long l) {
        StringBuilder sb = new StringBuilder("HTTP/1.1 " + i + " " + str + "\r\n");
        sb.append("Access-Control-Allow-Origin: *\r\nAccess-Control-Allow-Headers: *\r\nAccess-Control-Allow-Methods: GET, HEAD, OPTIONS\r\nAccess-Control-Allow-Private-Network: true\r\nAccess-Control-Expose-Headers: Accept-Ranges, Content-Length, Content-Range\r\nConnection: close\r\n");
        for (Map.Entry entry : map.entrySet()) {
            sb.append(((String) entry.getKey()) + ": " + ((String) entry.getValue()) + "\r\n");
        }
        if (l != null) {
            sb.append("Content-Length: " + l.longValue() + "\r\n");
        }
        sb.append("\r\n");
        String sb2 = sb.toString();
        Charset charset = StandardCharsets.ISO_8859_1;
        charset.getClass();
        byte[] bytes = sb2.getBytes(charset);
        bytes.getClass();
        bufferedOutputStream.write(bytes);
    }

    public final Object A(ar3 ar3Var, String str, String str2) {
        String str3;
        ci0 ci0Var = this;
        try {
            vq3 vq3Var = ar3Var.b;
            if (vq3Var != null) {
                String uri = vq3Var.a.toString();
                uri.getClass();
                if (ci0Var.t(uri)) {
                    return ar3Var;
                }
                Object obj = ci0Var.A.get(uri);
                if (obj != null) {
                    bi0 bi0Var = (bi0) obj;
                    ar3 ar3Var2 = bi0Var.b;
                    vq3 vq3Var2 = ar3Var2.b;
                    if (vq3Var2 != null) {
                        String uri2 = vq3Var2.a.toString();
                        uri2.getClass();
                        bi0Var.h = str2;
                        ai0 l = ci0Var.l();
                        nw2 nw2Var = vq3Var2.g;
                        nw2Var.getClass();
                        ArrayList arrayList = new ArrayList(zo0.V(nw2Var, 10));
                        int size = nw2Var.size();
                        int i = 0;
                        while (i < size) {
                            int i2 = i + 1;
                            zq3 zq3Var = (zq3) nw2Var.get(i);
                            String uri3 = zq3Var.a.toString();
                            uri3.getClass();
                            ni0 o = jf7.o(uri3, zq3Var.b);
                            yq3 a = zq3Var.a();
                            String uri4 = zq3Var.a.toString();
                            uri4.getClass();
                            ai0 ai0Var = l;
                            Uri parse = Uri.parse(I(ci0Var, ai0Var, bi0Var, uri4, false, o, 24));
                            parse.getClass();
                            a.a = parse;
                            if (o != null) {
                                str3 = "text/vtt";
                            } else {
                                str3 = zq3Var.b;
                            }
                            a.b = qy3.n(str3);
                            a.d = a34.i(zq3Var.g, str) ? 1 : 0;
                            arrayList.add(new zq3(a));
                            ci0Var = this;
                            l = ai0Var;
                            i = i2;
                        }
                        nq3 a2 = ar3Var2.a();
                        a2.c(I(this, l, bi0Var, uri2, false, null, 56));
                        a2.i = nw2.o(arrayList);
                        return a2.a();
                    }
                    throw new IllegalArgumentException("The selected episode does not have a Cast-compatible URL.");
                }
                throw new IllegalArgumentException("This source cannot be sent to a Cast device.");
            }
            throw new IllegalArgumentException("The selected episode does not have a playable URL.");
        } catch (Throwable th) {
            return new y45(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r2.l() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        r0 = r2.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0098, code lost:
    
        r4 = r0.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (1 > r4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
    
        if (r4 >= 524289) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b7, code lost:
    
        if (r0.o0().g(r4) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        throw new java.io.IOException("Incomplete Cast media segment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009d, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f2, code lost:
    
        defpackage.ze0.m("Cast source was replaced.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f7, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ai4 G(defpackage.l35 r11, defpackage.bi0 r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci0.G(l35, bi0, boolean):ai4");
    }

    public final void a() {
        ConcurrentHashMap.KeySetView keySetView = this.y;
        keySetView.getClass();
        Iterator it = keySetView.iterator();
        while (it.hasNext()) {
            ((bz4) ((nf0) it.next())).c();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.E.compareAndSet(false, true)) {
            return;
        }
        ai0 ai0Var = this.F;
        if (ai0Var != null) {
            ai0Var.a.close();
        }
        this.F = null;
        a();
        this.A.clear();
        this.B.clear();
        this.C.shutdownNow();
        this.D.shutdownNow();
    }

    public final synchronized ai0 l() {
        if (!this.E.get()) {
            ai0 ai0Var = this.F;
            if (ai0Var != null && !ai0Var.a.isClosed()) {
                return ai0Var;
            }
            Inet4Address q = q();
            if (q != null) {
                ai0 ai0Var2 = new ai0(new ServerSocket(0, 50, q), q);
                this.F = ai0Var2;
                this.C.execute(new gb(this, ai0Var2, (byte) 9));
                return ai0Var2;
            }
            throw new IllegalStateException("Connect this phone and Cast device to the same Wi-Fi network.");
        }
        throw new IllegalStateException("The Cast media relay is no longer available.");
    }

    public final Inet4Address p(Network network) {
        List<LinkAddress> linkAddresses;
        LinkProperties linkProperties = this.z.getLinkProperties(network);
        Object obj = null;
        if (linkProperties == null || (linkAddresses = linkProperties.getLinkAddresses()) == null) {
            return null;
        }
        c32 c32Var = new c32(new d32(new u22(new os(linkAddresses, (byte) 1), new ui((byte) 26), (byte) 4), true, xd.z));
        while (true) {
            if (!c32Var.hasNext()) {
                break;
            }
            Object next = c32Var.next();
            Inet4Address inet4Address = (Inet4Address) next;
            if (!inet4Address.isLoopbackAddress() && !inet4Address.isLinkLocalAddress()) {
                obj = next;
                break;
            }
        }
        return (Inet4Address) obj;
    }

    public final Inet4Address q() {
        ni5 osVar;
        Inet4Address inet4Address;
        ConnectivityManager connectivityManager = this.z;
        Network[] allNetworks = connectivityManager.getAllNetworks();
        allNetworks.getClass();
        if (allNetworks.length == 0) {
            osVar = st1.a;
        } else {
            osVar = new os(allNetworks, (byte) 0);
        }
        c32 c32Var = new c32(new d32(osVar, true, new l0(this, (byte) 25)));
        while (true) {
            if (c32Var.hasNext()) {
                inet4Address = p((Network) c32Var.next());
                if (inet4Address != null) {
                    break;
                }
            } else {
                inet4Address = null;
                break;
            }
        }
        if (inet4Address == null) {
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                return null;
            }
            return p(activeNetwork);
        }
        return inet4Address;
    }

    public final boolean t(String str) {
        ai0 ai0Var = this.F;
        if (ai0Var == null) {
            return false;
        }
        return b06.I(str, "http://" + ai0Var.b.getHostAddress() + ":" + ai0Var.a.getLocalPort() + "/cast/", false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:368:0x0706, code lost:
    
        if (r10.d(1) != null) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x07c0, code lost:
    
        if (r10.f() != null) goto L411;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x059a, code lost:
    
        if (((r5.longValue() - r12) % 188) == 0) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x094c, code lost:
    
        if (r6 >= 0) goto L503;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x064e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0649 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:522:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0921  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0942  */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v68 */
    /* JADX WARN: Type inference failed for: r12v69 */
    /* JADX WARN: Type inference failed for: r12v70, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v71, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v72, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0(java.io.BufferedOutputStream r28, defpackage.p45 r29, java.lang.String r30, java.lang.String r31, defpackage.ai0 r32, defpackage.bi0 r33) {
        /*
            Method dump skipped, instructions count: 2423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci0.u0(java.io.BufferedOutputStream, p45, java.lang.String, java.lang.String, ai0, bi0):void");
    }
}
