package z7;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.appcompat.widget.w;
import c9.i;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import msr.pistream.app.download.PiStreamDownloadService;
import r6.h0;
import y8.d0;
import y8.f0;
import y8.y;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static volatile f f12122h;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12123a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public ExecutorService f12124b = Executors.newFixedThreadPool(2);

    /* renamed from: c, reason: collision with root package name */
    public int f12125c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final ConcurrentHashMap f12126d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f12127e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f12128f = new ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public volatile w f12129g;

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f3 A[Catch: Exception -> 0x01ae, TryCatch #0 {Exception -> 0x01ae, blocks: (B:4:0x0011, B:21:0x0087, B:23:0x008b, B:26:0x009c, B:28:0x00a0, B:30:0x00a4, B:34:0x00b5, B:39:0x00cf, B:43:0x00d7, B:45:0x00f3, B:47:0x00fa, B:69:0x0157, B:71:0x015d, B:73:0x0161, B:75:0x0167, B:76:0x016b, B:78:0x016f, B:80:0x0175, B:81:0x0179, B:83:0x018a, B:84:0x018e, B:91:0x0198, B:93:0x01a3, B:94:0x01aa, B:97:0x00be, B:98:0x00c7, B:101:0x0084, B:49:0x0120, B:7:0x0022, B:8:0x002d, B:10:0x0033, B:12:0x0042, B:14:0x0048, B:15:0x0062, B:17:0x0070, B:19:0x0078), top: B:3:0x0011, inners: #3, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa A[Catch: Exception -> 0x01ae, TRY_LEAVE, TryCatch #0 {Exception -> 0x01ae, blocks: (B:4:0x0011, B:21:0x0087, B:23:0x008b, B:26:0x009c, B:28:0x00a0, B:30:0x00a4, B:34:0x00b5, B:39:0x00cf, B:43:0x00d7, B:45:0x00f3, B:47:0x00fa, B:69:0x0157, B:71:0x015d, B:73:0x0161, B:75:0x0167, B:76:0x016b, B:78:0x016f, B:80:0x0175, B:81:0x0179, B:83:0x018a, B:84:0x018e, B:91:0x0198, B:93:0x01a3, B:94:0x01aa, B:97:0x00be, B:98:0x00c7, B:101:0x0084, B:49:0x0120, B:7:0x0022, B:8:0x002d, B:10:0x0033, B:12:0x0042, B:14:0x0048, B:15:0x0062, B:17:0x0070, B:19:0x0078), top: B:3:0x0011, inners: #3, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(z7.f r12, android.content.Context r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.f.a(z7.f, android.content.Context, java.lang.String):void");
    }

    public static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, new SecretKeySpec(bArr2, "AES"), new IvParameterSpec(bArr3));
        return cipher.doFinal(bArr);
    }

    public static String c(String str, String str2) {
        try {
            Matcher matcher = Pattern.compile(str2.concat("=((\"[^\"]*\")|([^,\\s]+))")).matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean e(File file, File file2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[262144];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read > 0) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            fileOutputStream.close();
                            fileInputStream.close();
                            return true;
                        }
                    }
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
            return false;
        }
    }

    public static void g(Context context, b bVar, String str) {
        String str2;
        try {
            File[] listFiles = c.b(context).listFiles();
            if (listFiles != null && bVar != null) {
                String a10 = c.a(bVar);
                for (File file : listFiles) {
                    if (file.getName().startsWith(a10) || file.getName().startsWith(str)) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (bVar != null && (str2 = bVar.o) != null && !str2.isEmpty()) {
                if (bVar.o.startsWith("content://")) {
                    DocumentsContract.deleteDocument(context.getContentResolver(), Uri.parse(bVar.o));
                } else if (bVar.o.startsWith("file://")) {
                    new File(Uri.parse(bVar.o).getPath()).delete();
                }
            }
        } catch (Exception unused2) {
        }
    }

    public static void h(File file) {
        File[] listFiles;
        try {
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    h(file2);
                }
            }
            file.delete();
        } catch (Exception unused) {
        }
    }

    public static f o() {
        if (f12122h == null) {
            synchronized (f.class) {
                if (f12122h == null) {
                    f12122h = new f();
                }
            }
        }
        return f12122h;
    }

    public static byte[] p(y8.w wVar, String str, HashMap hashMap) {
        y yVar = new y();
        yVar.d(str);
        yVar.b("User-Agent", "Mozilla/5.0");
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                yVar.b((String) entry.getKey(), (String) entry.getValue());
            } catch (Exception unused) {
            }
        }
        d0 c6 = new i(wVar, yVar.a(), false).c();
        f0 f0Var = c6.f11697x;
        if (f0Var != null) {
            try {
                if (c6.f()) {
                    byte[] a10 = f0Var.a();
                    c6.close();
                    return a10;
                }
            } catch (Throwable th) {
                try {
                    c6.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        c6.close();
        return null;
    }

    public static String q(y8.w wVar, String str, HashMap hashMap) {
        y yVar = new y();
        yVar.d(str);
        yVar.b("User-Agent", "Mozilla/5.0");
        for (Map.Entry entry : hashMap.entrySet()) {
            try {
                yVar.b((String) entry.getKey(), (String) entry.getValue());
            } catch (Exception unused) {
            }
        }
        d0 c6 = new i(wVar, yVar.a(), false).c();
        f0 f0Var = c6.f11697x;
        if (f0Var != null) {
            try {
                if (c6.f()) {
                    String q9 = f0Var.q();
                    c6.close();
                    return q9;
                }
            } catch (Throwable th) {
                try {
                    c6.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        c6.close();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d A[Catch: Exception -> 0x0062, TryCatch #1 {Exception -> 0x0062, blocks: (B:3:0x0001, B:4:0x000b, B:6:0x000e, B:14:0x003a, B:16:0x003d, B:18:0x0049, B:24:0x0057, B:37:0x005d), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String v(java.lang.String r9, java.lang.String r10) {
        /*
            r0 = 0
            java.lang.String r1 = "\n"
            java.lang.String[] r10 = r10.split(r1)     // Catch: java.lang.Exception -> L62
            r1 = -1
            r3 = 0
            r4 = r0
        Lb:
            int r5 = r10.length     // Catch: java.lang.Exception -> L62
            if (r3 >= r5) goto L5a
            r5 = r10[r3]     // Catch: java.lang.Exception -> L62
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Exception -> L62
            java.lang.String r6 = "#EXT-X-STREAM-INF"
            boolean r6 = r5.startsWith(r6)     // Catch: java.lang.Exception -> L62
            if (r6 == 0) goto L57
            java.lang.String r6 = "BANDWIDTH"
            java.lang.String r5 = c(r5, r6)     // Catch: java.lang.Exception -> L36
            if (r5 != 0) goto L25
            goto L36
        L25:
            java.lang.String r6 = "\""
            java.lang.String r7 = ""
            java.lang.String r5 = r5.replace(r6, r7)     // Catch: java.lang.Exception -> L36
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Exception -> L36
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Exception -> L36
            goto L38
        L36:
            r5 = 0
        L38:
            int r7 = r3 + 1
            int r8 = r10.length     // Catch: java.lang.Exception -> L62
            if (r7 >= r8) goto L57
            r7 = r10[r7]     // Catch: java.lang.Exception -> L62
            java.lang.String r7 = r7.trim()     // Catch: java.lang.Exception -> L62
            boolean r8 = r7.isEmpty()     // Catch: java.lang.Exception -> L62
            if (r8 != 0) goto L57
            java.lang.String r8 = "#"
            boolean r8 = r7.startsWith(r8)     // Catch: java.lang.Exception -> L62
            if (r8 != 0) goto L57
            int r8 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r8 < 0) goto L57
            r1 = r5
            r4 = r7
        L57:
            int r3 = r3 + 1
            goto Lb
        L5a:
            if (r4 != 0) goto L5d
            return r0
        L5d:
            java.lang.String r9 = y(r9, r4)     // Catch: java.lang.Exception -> L62
            return r9
        L62:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.f.v(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String y(String str, String str2) {
        try {
            if (str2.startsWith("http")) {
                return str2;
            }
            return new URL(new URL(str), str2).toString();
        } catch (Exception unused) {
            return str2;
        }
    }

    public final void A(Context context) {
        String str;
        Context applicationContext = context.getApplicationContext();
        Iterator it = d.a(applicationContext).iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f12101u == 3 && (str = bVar.f12102v) != null && str.contains("Wi-Fi")) {
                ConcurrentHashMap concurrentHashMap = this.f12127e;
                String str2 = bVar.f12082a;
                Boolean bool = Boolean.FALSE;
                concurrentHashMap.put(str2, bool);
                this.f12128f.put(bVar.f12082a, bool);
                z9 = true;
                bVar.f12101u = 1;
                bVar.f12102v = "";
                d.c(applicationContext, bVar);
            }
        }
        if (z9) {
            l();
            PiStreamDownloadService.startAction(applicationContext, PiStreamDownloadService.ACTION_KICK);
        }
        x(applicationContext);
    }

    public final void B(Context context, b bVar) {
        bVar.f12101u = 2;
        bVar.f12102v = "";
        d.c(context, bVar);
        ConcurrentHashMap concurrentHashMap = this.f12127e;
        String str = bVar.f12082a;
        Boolean bool = Boolean.FALSE;
        concurrentHashMap.put(str, bool);
        this.f12128f.put(bVar.f12082a, bool);
        PiStreamDownloadService.startAction(context, PiStreamDownloadService.ACTION_KICK);
        this.f12126d.put(bVar.f12082a, w(com.bumptech.glide.c.u(context)).submit(new d0.a(this, context, bVar, 9)));
    }

    public final void d(Context context, String str) {
        this.f12128f.put(str, Boolean.TRUE);
        this.f12127e.put(str, Boolean.FALSE);
        Future future = (Future) this.f12126d.get(str);
        if (future != null) {
            future.cancel(true);
        }
        b b10 = d.b(context.getApplicationContext(), str);
        if (b10 != null && b10.f12101u != 4) {
            b10.f12101u = 6;
            d.c(context.getApplicationContext(), b10);
            l();
        }
        PiStreamDownloadService.refresh(context.getApplicationContext());
    }

    public final void f(Context context, String str) {
        d(context, str);
        Context applicationContext = context.getApplicationContext();
        b b10 = d.b(applicationContext, str);
        synchronized (d.f12118a) {
            applicationContext.getApplicationContext().getSharedPreferences("pistream_downloads", 0).edit().remove(str).apply();
        }
        l();
        PiStreamDownloadService.refresh(applicationContext);
        w(com.bumptech.glide.c.u(applicationContext)).submit(new j.g(this, applicationContext, b10, str, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x010a, code lost:
    
        if (e(r4, r0) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129 A[Catch: Exception -> 0x0159, TryCatch #3 {Exception -> 0x0159, blocks: (B:3:0x000d, B:4:0x001c, B:8:0x002a, B:9:0x002b, B:20:0x0083, B:22:0x0089, B:25:0x008f, B:27:0x00ab, B:74:0x00b5, B:31:0x00bf, B:34:0x00c7, B:51:0x010f, B:53:0x0114, B:55:0x011a, B:58:0x0123, B:60:0x0129, B:62:0x013d, B:66:0x0143, B:69:0x014a, B:78:0x0150, B:82:0x0157, B:83:0x0158, B:11:0x0057, B:12:0x0063, B:14:0x0069, B:16:0x006d, B:19:0x0074, B:7:0x001e, B:29:0x00ae), top: B:2:0x000d, inners: #0, #2, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(android.content.Context r27, z7.b r28, java.io.File r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.f.i(android.content.Context, z7.b, java.io.File, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0280 A[Catch: Exception -> 0x029b, TRY_LEAVE, TryCatch #0 {Exception -> 0x029b, blocks: (B:3:0x0013, B:5:0x001b, B:8:0x0025, B:10:0x002d, B:12:0x0035, B:15:0x003b, B:17:0x0041, B:19:0x0047, B:21:0x004f, B:23:0x0055, B:24:0x0063, B:26:0x0066, B:28:0x0074, B:30:0x0098, B:31:0x0081, B:33:0x0087, B:35:0x008f, B:40:0x009b, B:42:0x00a1, B:46:0x00ab, B:48:0x00bf, B:50:0x00cb, B:52:0x00d3, B:54:0x00e4, B:56:0x00f8, B:58:0x0118, B:60:0x0122, B:63:0x0129, B:85:0x01d7, B:108:0x019d, B:121:0x026d, B:125:0x0272, B:127:0x0280, B:140:0x0293, B:139:0x0290, B:144:0x0294, B:67:0x0134, B:69:0x0141, B:71:0x0149, B:73:0x0153, B:75:0x015b, B:77:0x0167, B:82:0x01cd, B:89:0x01a9, B:84:0x01d2, B:90:0x01dc, B:92:0x01eb, B:97:0x0234, B:98:0x01f8, B:100:0x01fe, B:104:0x016a, B:107:0x0176, B:112:0x023e, B:114:0x0244, B:116:0x0254, B:117:0x0267, B:118:0x0258, B:120:0x0264, B:130:0x0138, B:134:0x028a), top: B:2:0x0013, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0287 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0138 A[Catch: all -> 0x0288, TryCatch #1 {all -> 0x0288, blocks: (B:67:0x0134, B:69:0x0141, B:71:0x0149, B:73:0x0153, B:75:0x015b, B:77:0x0167, B:82:0x01cd, B:89:0x01a9, B:84:0x01d2, B:90:0x01dc, B:92:0x01eb, B:97:0x0234, B:98:0x01f8, B:100:0x01fe, B:104:0x016a, B:107:0x0176, B:112:0x023e, B:114:0x0244, B:116:0x0254, B:117:0x0267, B:118:0x0258, B:120:0x0264, B:130:0x0138), top: B:65:0x0132, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118 A[Catch: Exception -> 0x029b, TryCatch #0 {Exception -> 0x029b, blocks: (B:3:0x0013, B:5:0x001b, B:8:0x0025, B:10:0x002d, B:12:0x0035, B:15:0x003b, B:17:0x0041, B:19:0x0047, B:21:0x004f, B:23:0x0055, B:24:0x0063, B:26:0x0066, B:28:0x0074, B:30:0x0098, B:31:0x0081, B:33:0x0087, B:35:0x008f, B:40:0x009b, B:42:0x00a1, B:46:0x00ab, B:48:0x00bf, B:50:0x00cb, B:52:0x00d3, B:54:0x00e4, B:56:0x00f8, B:58:0x0118, B:60:0x0122, B:63:0x0129, B:85:0x01d7, B:108:0x019d, B:121:0x026d, B:125:0x0272, B:127:0x0280, B:140:0x0293, B:139:0x0290, B:144:0x0294, B:67:0x0134, B:69:0x0141, B:71:0x0149, B:73:0x0153, B:75:0x015b, B:77:0x0167, B:82:0x01cd, B:89:0x01a9, B:84:0x01d2, B:90:0x01dc, B:92:0x01eb, B:97:0x0234, B:98:0x01f8, B:100:0x01fe, B:104:0x016a, B:107:0x0176, B:112:0x023e, B:114:0x0244, B:116:0x0254, B:117:0x0267, B:118:0x0258, B:120:0x0264, B:130:0x0138, B:134:0x028a), top: B:2:0x0013, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134 A[Catch: all -> 0x0288, TRY_ENTER, TryCatch #1 {all -> 0x0288, blocks: (B:67:0x0134, B:69:0x0141, B:71:0x0149, B:73:0x0153, B:75:0x015b, B:77:0x0167, B:82:0x01cd, B:89:0x01a9, B:84:0x01d2, B:90:0x01dc, B:92:0x01eb, B:97:0x0234, B:98:0x01f8, B:100:0x01fe, B:104:0x016a, B:107:0x0176, B:112:0x023e, B:114:0x0244, B:116:0x0254, B:117:0x0267, B:118:0x0258, B:120:0x0264, B:130:0x0138), top: B:65:0x0132, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0149 A[Catch: all -> 0x0288, TryCatch #1 {all -> 0x0288, blocks: (B:67:0x0134, B:69:0x0141, B:71:0x0149, B:73:0x0153, B:75:0x015b, B:77:0x0167, B:82:0x01cd, B:89:0x01a9, B:84:0x01d2, B:90:0x01dc, B:92:0x01eb, B:97:0x0234, B:98:0x01f8, B:100:0x01fe, B:104:0x016a, B:107:0x0176, B:112:0x023e, B:114:0x0244, B:116:0x0254, B:117:0x0267, B:118:0x0258, B:120:0x0264, B:130:0x0138), top: B:65:0x0132, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(android.content.Context r22, z7.b r23, java.util.HashMap r24, java.io.File r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.f.j(android.content.Context, z7.b, java.util.HashMap, java.io.File, java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0043, code lost:
    
        if (r0.f12099s > 0) goto L249;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0312 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:? A[Catch: all -> 0x031c, SYNTHETIC, TRY_LEAVE, TryCatch #18 {all -> 0x031c, blocks: (B:168:0x02b2, B:203:0x031b, B:202:0x0318, B:175:0x02c3, B:197:0x0312), top: B:113:0x01f0, inners: #11 }] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v12, types: [y8.d0] */
    /* JADX WARN: Type inference failed for: r25v13 */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v16 */
    /* JADX WARN: Type inference failed for: r25v2, types: [y8.d0] */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r26v1 */
    /* JADX WARN: Type inference failed for: r26v10 */
    /* JADX WARN: Type inference failed for: r26v2, types: [k9.f] */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r26v5 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v4, types: [y8.d0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(android.content.Context r24, z7.b r25, java.util.HashMap r26, java.io.File r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.f.k(android.content.Context, z7.b, java.util.HashMap, java.io.File, java.lang.String):boolean");
    }

    public final void l() {
        ArrayList arrayList;
        synchronized (this.f12123a) {
            arrayList = new ArrayList(this.f12123a);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l8.b bVar = (l8.b) it.next();
            try {
                bVar.f6895a.f6904p0.post(new l8.a(bVar, 1));
            } catch (Exception unused) {
            }
        }
    }

    public final String m(Context context, a8.b bVar, a8.e eVar, a8.h hVar, List list, String str) {
        String str2;
        String str3;
        int i10;
        int i11;
        String str4;
        String str5;
        String str6;
        boolean z9;
        String str7;
        int i12;
        Context applicationContext = context.getApplicationContext();
        if (com.bumptech.glide.c.p(applicationContext) == null) {
            this.f12129g = new w(context, bVar, eVar, hVar, list, str);
            return "FOLDER_REQUIRED";
        }
        int[] D0 = h0.D0(eVar);
        b bVar2 = new b();
        if (hVar == null || (str2 = hVar.f198a) == null) {
            str2 = "AUTO";
        }
        if (str == null) {
            str = "";
        }
        String str8 = eVar.f184b + "|" + str;
        String replaceAll = str2.replaceAll("[^0-9a-zA-Z]", "");
        StringBuilder sb = new StringBuilder("dl_");
        sb.append(Math.abs((str8 + "|" + replaceAll).hashCode()));
        sb.append("_");
        sb.append(replaceAll);
        String sb2 = sb.toString();
        bVar2.f12082a = sb2;
        b b10 = d.b(applicationContext, sb2);
        if (b10 != null && ((i12 = b10.f12101u) == 2 || i12 == 1)) {
            return b10.f12082a;
        }
        if (b10 != null) {
            this.f12127e.put(bVar2.f12082a, Boolean.TRUE);
            Future future = (Future) this.f12126d.get(bVar2.f12082a);
            if (future != null) {
                future.cancel(true);
            }
            ConcurrentHashMap concurrentHashMap = this.f12127e;
            String str9 = bVar2.f12082a;
            Boolean bool = Boolean.FALSE;
            concurrentHashMap.put(str9, bool);
            this.f12128f.put(bVar2.f12082a, bool);
            String str10 = bVar2.f12082a;
            g(applicationContext, d.b(applicationContext, str10), str10);
        }
        if ((bVar == null || (str3 = bVar.f168a) == null) && (str3 = eVar.f187e) == null) {
            str3 = "Video";
        }
        bVar2.f12083b = str3;
        String str11 = eVar.f183a;
        if (str11 == null) {
            str11 = "Episode " + eVar.f186d;
        }
        bVar2.f12084c = str11;
        bVar2.f12085d = eVar.f184b;
        bVar2.f12086e = eVar.f188f;
        if (D0 != null) {
            i10 = D0[0];
        } else {
            i10 = 0;
        }
        bVar2.f12087f = i10;
        if (D0 != null) {
            i11 = D0[1];
        } else {
            i11 = (int) eVar.f186d;
        }
        bVar2.f12088g = i11;
        bVar2.f12089h = str2;
        bVar2.f12090i = str;
        if (hVar == null) {
            str4 = "";
        } else {
            str4 = hVar.f199b;
        }
        bVar2.f12091j = str4;
        if (hVar == null || (str5 = hVar.f205y) == null) {
            str5 = "";
        }
        bVar2.f12092k = str5;
        if (hVar == null || (str6 = hVar.A) == null) {
            str6 = "";
        }
        bVar2.f12093l = str6;
        if (hVar != null && hVar.B) {
            z9 = true;
        } else {
            z9 = false;
        }
        bVar2.f12094m = z9;
        bVar2.f12095n = c.a(bVar2) + ".mp4";
        bVar2.f12101u = 1;
        bVar2.f12103w = System.currentTimeMillis();
        bVar2.f12098r = 0;
        bVar2.f12099s = 0L;
        bVar2.f12100t = 0L;
        bVar2.f12105y = "";
        bVar2.f12106z = 0;
        bVar2.A = 0;
        bVar2.f12097q = new ArrayList();
        bVar2.o = "";
        bVar2.f12102v = "";
        bVar2.f12104x = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a8.g gVar = (a8.g) it.next();
                if (gVar != null && (str7 = gVar.f195a) != null && !str7.isEmpty()) {
                    bVar2.f12096p.add(gVar.f195a);
                }
            }
        }
        d.c(applicationContext, bVar2);
        l();
        PiStreamDownloadService.startAction(applicationContext, PiStreamDownloadService.ACTION_KICK);
        x(applicationContext);
        return bVar2.f12082a;
    }

    public final void n(Context context, String str, String str2) {
        b b10 = d.b(context, str);
        if (b10 == null) {
            return;
        }
        Boolean bool = Boolean.TRUE;
        if (bool.equals(this.f12128f.get(str))) {
            b10.f12101u = 6;
        } else if (bool.equals(this.f12127e.get(str))) {
            b10.f12101u = 3;
        } else {
            b10.f12101u = 5;
            if (str2 == null) {
                str2 = "Download failed";
            }
            b10.f12102v = str2;
        }
        d.c(context, b10);
        l();
    }

    public final boolean r(String str) {
        Boolean bool = Boolean.TRUE;
        if (!bool.equals(this.f12128f.get(str)) && !bool.equals(this.f12127e.get(str))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd A[Catch: Exception -> 0x0222, TryCatch #5 {Exception -> 0x0222, blocks: (B:3:0x0013, B:16:0x004a, B:18:0x0050, B:21:0x005d, B:24:0x0067, B:27:0x006f, B:30:0x0078, B:32:0x007e, B:33:0x008d, B:36:0x0093, B:48:0x0055, B:52:0x009d, B:54:0x00b7, B:55:0x00bd, B:58:0x00d7, B:60:0x00dd, B:62:0x00e3, B:64:0x00e9, B:66:0x0102, B:68:0x0106, B:70:0x010f, B:80:0x00fe), top: B:2:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(android.content.Context r23, z7.b r24, java.io.File r25) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.f.s(android.content.Context, z7.b, java.io.File):boolean");
    }

    public final void t(Context context, String str) {
        int i10;
        this.f12127e.put(str, Boolean.TRUE);
        Future future = (Future) this.f12126d.get(str);
        if (future != null) {
            future.cancel(true);
        }
        b b10 = d.b(context.getApplicationContext(), str);
        if (b10 != null && ((i10 = b10.f12101u) == 2 || i10 == 1)) {
            b10.f12101u = 3;
            b10.f12102v = "";
            d.c(context.getApplicationContext(), b10);
            l();
        }
        PiStreamDownloadService.refresh(context.getApplicationContext());
    }

    public final void u(Context context) {
        int i10;
        Context applicationContext = context.getApplicationContext();
        Iterator it = d.a(applicationContext).iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i11 = bVar.f12101u;
            if (i11 == 2 || i11 == 1) {
                this.f12127e.put(bVar.f12082a, Boolean.TRUE);
                Future future = (Future) this.f12126d.get(bVar.f12082a);
                if (future != null) {
                    future.cancel(true);
                }
                b b10 = d.b(applicationContext, bVar.f12082a);
                if (b10 != null && ((i10 = b10.f12101u) == 2 || i10 == 1)) {
                    b10.f12101u = 3;
                    b10.f12102v = "Paused: Wi-Fi lost";
                    d.c(applicationContext, b10);
                }
            }
        }
        l();
    }

    public final synchronized ExecutorService w(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        if (i10 > 3) {
            i10 = 3;
        }
        ExecutorService executorService = this.f12124b;
        if (executorService == null || executorService.isShutdown() || this.f12125c != i10) {
            this.f12125c = i10;
            this.f12124b = Executors.newFixedThreadPool(i10);
        }
        return this.f12124b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r4.hasTransport(3) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0065, code lost:
    
        if (r4.hasTransport(1) != false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void x(android.content.Context r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            android.content.Context r9 = r9.getApplicationContext()     // Catch: java.lang.Throwable -> La3
            int r0 = com.bumptech.glide.c.u(r9)     // Catch: java.lang.Throwable -> La3
            java.util.concurrent.ConcurrentHashMap r1 = r8.f12126d     // Catch: java.lang.Throwable -> La3
            int r1 = r1.size()     // Catch: java.lang.Throwable -> La3
            if (r1 < r0) goto L13
            monitor-exit(r8)
            return
        L13:
            java.util.ArrayList r2 = z7.d.a(r9)     // Catch: java.lang.Throwable -> La3
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> La3
        L1b:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> La3
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> La3
            z7.b r3 = (z7.b) r3     // Catch: java.lang.Throwable -> La3
            if (r1 < r0) goto L2b
            goto L9e
        L2b:
            int r4 = r3.f12101u     // Catch: java.lang.Throwable -> La3
            r5 = 1
            if (r4 == r5) goto L31
            goto L1b
        L31:
            java.util.concurrent.ConcurrentHashMap r4 = r8.f12126d     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = r3.f12082a     // Catch: java.lang.Throwable -> La3
            boolean r4 = r4.containsKey(r6)     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L3c
            goto L1b
        L3c:
            android.content.SharedPreferences r4 = com.bumptech.glide.c.b0(r9)     // Catch: java.lang.Throwable -> La3
            java.lang.String r6 = "download_wifi_only"
            r7 = 0
            boolean r4 = r4.getBoolean(r6, r7)     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto L97
            java.lang.String r4 = "connectivity"
            java.lang.Object r4 = r9.getSystemService(r4)     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La3
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La3
            if (r4 != 0) goto L54
            goto L6a
        L54:
            android.net.Network r6 = r4.getActiveNetwork()     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La3
            if (r6 != 0) goto L5b
            goto L68
        L5b:
            android.net.NetworkCapabilities r4 = r4.getNetworkCapabilities(r6)     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La3
            if (r4 == 0) goto L68
            boolean r4 = r4.hasTransport(r5)     // Catch: java.lang.Exception -> L6a java.lang.Throwable -> La3
            if (r4 == 0) goto L68
            goto L6a
        L68:
            r4 = r7
            goto L6b
        L6a:
            r4 = r5
        L6b:
            if (r4 != 0) goto L97
            java.lang.String r4 = "connectivity"
            java.lang.Object r4 = r9.getSystemService(r4)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> La3
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> La3
            if (r4 == 0) goto L8c
            android.net.Network r6 = r4.getActiveNetwork()     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> La3
            if (r6 != 0) goto L7e
            goto L8c
        L7e:
            android.net.NetworkCapabilities r4 = r4.getNetworkCapabilities(r6)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> La3
            if (r4 == 0) goto L8c
            r6 = 3
            boolean r4 = r4.hasTransport(r6)     // Catch: java.lang.Exception -> L8c java.lang.Throwable -> La3
            if (r4 == 0) goto L8c
            goto L8d
        L8c:
            r5 = r7
        L8d:
            if (r5 != 0) goto L97
            java.lang.String r4 = "Waiting for Wi-Fi"
            r3.f12102v = r4     // Catch: java.lang.Throwable -> La3
            z7.d.c(r9, r3)     // Catch: java.lang.Throwable -> La3
            goto L1b
        L97:
            r8.B(r9, r3)     // Catch: java.lang.Throwable -> La3
            int r1 = r1 + 1
            goto L1b
        L9e:
            r8.l()     // Catch: java.lang.Throwable -> La3
            monitor-exit(r8)
            return
        La3:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: z7.f.x(android.content.Context):void");
    }

    public final void z(Context context, String str) {
        int i10;
        ConcurrentHashMap concurrentHashMap = this.f12127e;
        Boolean bool = Boolean.FALSE;
        concurrentHashMap.put(str, bool);
        this.f12128f.put(str, bool);
        b b10 = d.b(context.getApplicationContext(), str);
        if (b10 != null && ((i10 = b10.f12101u) == 3 || i10 == 5 || i10 == 6)) {
            b10.f12101u = 1;
            b10.f12102v = "";
            d.c(context.getApplicationContext(), b10);
            l();
        }
        PiStreamDownloadService.startAction(context.getApplicationContext(), PiStreamDownloadService.ACTION_KICK);
        x(context.getApplicationContext());
    }
}
