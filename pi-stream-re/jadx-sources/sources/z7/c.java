package z7;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c1.r0;
import e0.j;
import f.m0;
import f.o0;
import f1.o;
import g0.g1;
import i4.s;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import msr.pistream.app.R;
import r6.h0;
import y.m;
import y8.v;
import y8.w;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f12107a;

    /* renamed from: b, reason: collision with root package name */
    public static s f12108b;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f12109c = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f12110d = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: e, reason: collision with root package name */
    public static final u.f f12111e = new u.f(3);

    /* renamed from: f, reason: collision with root package name */
    public static final o0 f12112f = new o0(1);

    /* renamed from: g, reason: collision with root package name */
    public static final o0 f12113g = new o0(2);

    /* renamed from: h, reason: collision with root package name */
    public static final b5.c f12114h = new b5.c("account_capability_api", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final b5.c f12115i = new b5.c("google_auth_service_accounts", 2);

    /* renamed from: j, reason: collision with root package name */
    public static final b5.c f12116j = new b5.c("google_auth_service_token", 3);

    /* renamed from: k, reason: collision with root package name */
    public static final b5.c f12117k = new b5.c("work_account_client_is_whitelisted", 1);

    public static String a(b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5 = bVar.f12083b;
        if (str5 != null && !str5.isEmpty()) {
            str = bVar.f12083b;
        } else {
            str = "video";
        }
        String x9 = x(str);
        String str6 = bVar.f12084c;
        if (str6 != null && !str6.isEmpty()) {
            str2 = x(bVar.f12084c);
        } else {
            str2 = "E" + bVar.f12088g;
        }
        String str7 = bVar.f12089h;
        String str8 = "";
        if (str7 != null && !str7.isEmpty()) {
            str3 = bVar.f12089h.replaceAll("[^0-9a-zA-Z]", "");
        } else {
            str3 = "HD";
        }
        if (bVar.f12087f <= 0 && bVar.f12088g <= 0) {
            str4 = "";
        } else {
            str4 = "_S" + bVar.f12087f + "E" + bVar.f12088g;
        }
        String str9 = bVar.f12090i;
        if (str9 != null && !str9.trim().isEmpty() && !bVar.f12090i.equalsIgnoreCase("Original")) {
            str8 = "_" + x(bVar.f12090i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(x9);
        sb.append("_");
        sb.append(str2);
        sb.append(str4);
        sb.append("_");
        return a3.g.t(sb, str3, str8);
    }

    public static File b(Context context) {
        File file = new File(context.getExternalFilesDir(null), ".pistream_dl");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static final void c(View view) {
        h0.u(view, "<this>");
        g1 g1Var = new g1(view, null);
        n7.d dVar = new n7.d();
        dVar.f8017d = com.bumptech.glide.d.o(dVar, dVar, g1Var);
        while (dVar.hasNext()) {
            View view2 = (View) dVar.next();
            m0.a aVar = (m0.a) view2.getTag(R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new m0.a();
                view2.setTag(R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList = aVar.f7041a;
            int w9 = com.bumptech.glide.c.w(arrayList);
            if (-1 < w9) {
                a3.g.z(arrayList.get(w9));
                throw null;
            }
        }
    }

    public static a8.h f(int i10, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return null;
        }
        if (i10 <= 0) {
            return (a8.h) arrayList.get(0);
        }
        a8.h hVar = (a8.h) arrayList.get(0);
        int abs = Math.abs(v(hVar.f198a) - i10);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a8.h hVar2 = (a8.h) it.next();
            int abs2 = Math.abs(v(hVar2.f198a) - i10);
            if (abs2 < abs) {
                hVar = hVar2;
                abs = abs2;
            }
        }
        return hVar;
    }

    public static List g(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null) {
            return arrayList2;
        }
        if (arrayList2 == null) {
            return arrayList;
        }
        n.f fVar = new n.f(arrayList2.size() + arrayList.size());
        fVar.addAll(arrayList);
        fVar.addAll(arrayList2);
        return new ArrayList(fVar);
    }

    public static void h(File file, File file2, e eVar) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                byte[] bArr = new byte[262144];
                long length = file.length();
                long j4 = 0;
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read > 0) {
                        fileOutputStream.write(bArr, 0, read);
                        j4 += read;
                        if (eVar != null && length > 0) {
                            eVar.a((int) ((100 * j4) / length));
                        }
                    } else {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long i(File file) {
        long length;
        long j4 = 0;
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return file.length();
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    length = i(file2);
                } else {
                    length = file2.length();
                }
                j4 += length;
            }
        }
        return j4;
    }

    public static j j(j jVar, String str) {
        j jVar2;
        j[] l10 = jVar.l();
        int length = l10.length;
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                jVar2 = l10[i10];
                if (str.equals(jVar2.f())) {
                    break;
                }
                i10++;
            } else {
                jVar2 = null;
                break;
            }
        }
        if (jVar2 != null && jVar2.g()) {
            return jVar2;
        }
        p0.a b10 = jVar.b(str);
        if (b10 != null) {
            return b10;
        }
        throw new IllegalStateException(r.f.d("Cannot create dir ", str));
    }

    public static ArrayList k(Context context, String str, j jVar, String str2) {
        File[] listFiles;
        String str3;
        String str4;
        ArrayList arrayList = new ArrayList();
        try {
            listFiles = b(context).listFiles();
        } catch (Exception unused) {
        }
        if (listFiles == null) {
            return arrayList;
        }
        for (File file : listFiles) {
            if (file.getName().startsWith(str2 + "_sub_")) {
                if (file.getName().endsWith(".srt")) {
                    str3 = ".srt";
                } else {
                    str3 = ".vtt";
                }
                String str5 = str2 + str3;
                if (jVar != null) {
                    try {
                        if (str3.equals(".srt")) {
                            str4 = "text/plain";
                        } else {
                            str4 = "text/vtt";
                        }
                        p0.a c6 = jVar.c(str4, str5);
                        if (c6 != null) {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            try {
                                OutputStream openOutputStream = context.getContentResolver().openOutputStream(c6.f8418d);
                                if (openOutputStream == null) {
                                    if (openOutputStream != null) {
                                        openOutputStream.close();
                                    }
                                    fileInputStream.close();
                                } else {
                                    try {
                                        byte[] bArr = new byte[65536];
                                        while (true) {
                                            int read = fileInputStream.read(bArr);
                                            if (read <= 0) {
                                                break;
                                            }
                                            openOutputStream.write(bArr, 0, read);
                                        }
                                        openOutputStream.close();
                                        fileInputStream.close();
                                        arrayList.add(c6.f8418d.toString());
                                    } catch (Throwable th) {
                                        try {
                                            openOutputStream.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                        break;
                                    }
                                }
                            } finally {
                            }
                        }
                    } catch (Exception unused2) {
                        continue;
                    }
                } else if (str != null) {
                    File file2 = new File(str, str5);
                    h(file, file2, null);
                    arrayList.add(Uri.fromFile(file2).toString());
                }
            }
        }
        return arrayList;
    }

    public static void l(Context context, b bVar, File file, e eVar) {
        String a10 = a(bVar);
        String s9 = a3.g.s(a10, ".mp4");
        bVar.f12097q = new ArrayList();
        Uri p3 = com.bumptech.glide.c.p(context);
        String str = "Videos";
        p0.a aVar = null;
        if (p3 == null) {
            File file2 = new File(new File(context.getExternalFilesDir(null), "Downloads"), "Pi Stream Downloads");
            if (!file2.exists()) {
                file2.mkdirs();
            }
            String str2 = bVar.f12083b;
            if (str2 != null) {
                str = str2;
            }
            File file3 = new File(file2, x(str));
            if (!file3.exists()) {
                file3.mkdirs();
            }
            File file4 = new File(file3, s9);
            h(file, file4, eVar);
            bVar.f12097q.addAll(k(context, file3.getAbsolutePath(), null, a10));
            bVar.o = Uri.fromFile(file4).toString();
            return;
        }
        try {
            String treeDocumentId = DocumentsContract.getTreeDocumentId(p3);
            if (DocumentsContract.isDocumentUri(context, p3)) {
                treeDocumentId = DocumentsContract.getDocumentId(p3);
            }
            aVar = new p0.a(aVar, context, DocumentsContract.buildDocumentUriUsingTree(p3, treeDocumentId), 1);
        } catch (Exception unused) {
        }
        if (aVar != null) {
            j j4 = j(aVar, "Pi Stream Downloads");
            String str3 = bVar.f12083b;
            if (str3 != null) {
                str = str3;
            }
            j j10 = j(j4, x(str));
            p0.a c6 = j10.c("video/mp4", s9);
            if (c6 != null) {
                Uri uri = c6.f8418d;
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri);
                    try {
                        if (openOutputStream != null) {
                            byte[] bArr = new byte[262144];
                            long length = file.length();
                            long j11 = 0;
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read > 0) {
                                    openOutputStream.write(bArr, 0, read);
                                    j11 += read;
                                    if (length > 0) {
                                        eVar.a((int) ((100 * j11) / length));
                                    }
                                } else {
                                    openOutputStream.flush();
                                    openOutputStream.close();
                                    fileInputStream.close();
                                    bVar.f12097q.addAll(k(context, null, j10, a10));
                                    bVar.o = uri.toString();
                                    return;
                                }
                            }
                        } else {
                            throw new IllegalStateException("Cannot open output");
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                throw new IllegalStateException("Cannot create file");
            }
        } else {
            throw new IllegalStateException("Download folder not accessible");
        }
    }

    public static ArrayList m(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return arrayList2;
        }
        a3.g.z(it.next());
        throw null;
    }

    public static int n(f1.s sVar) {
        int i10 = sVar.i(4);
        if (i10 == 15) {
            if (sVar.b() >= 24) {
                return sVar.i(24);
            }
            throw r0.a("AAC header insufficient data", null);
        }
        if (i10 < 13) {
            return f12109c[i10];
        }
        throw r0.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static ArrayList o(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static w p() {
        v vVar = new v();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        vVar.a(15L, timeUnit);
        vVar.b(30L, timeUnit);
        vVar.f11812h = true;
        return new w(vVar);
    }

    public static d2.a s(f1.s sVar, boolean z9) {
        int i10 = sVar.i(5);
        if (i10 == 31) {
            i10 = sVar.i(6) + 32;
        }
        int n9 = n(sVar);
        int i11 = sVar.i(4);
        String n10 = a3.g.n("mp4a.40.", i10);
        if (i10 == 5 || i10 == 29) {
            n9 = n(sVar);
            int i12 = sVar.i(5);
            if (i12 == 31) {
                i12 = sVar.i(6) + 32;
            }
            i10 = i12;
            if (i10 == 22) {
                i11 = sVar.i(4);
            }
        }
        if (z9) {
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 6 && i10 != 7 && i10 != 17) {
                switch (i10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw r0.c("Unsupported audio object type: " + i10);
                }
            }
            if (sVar.h()) {
                o.f("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (sVar.h()) {
                sVar.r(14);
            }
            boolean h10 = sVar.h();
            if (i11 != 0) {
                if (i10 == 6 || i10 == 20) {
                    sVar.r(3);
                }
                if (h10) {
                    if (i10 == 22) {
                        sVar.r(16);
                    }
                    if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                        sVar.r(3);
                    }
                    sVar.r(1);
                }
                switch (i10) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i13 = sVar.i(2);
                        if (i13 == 2 || i13 == 3) {
                            throw r0.c("Unsupported epConfig: " + i13);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i14 = f12110d[i11];
        if (i14 != -1) {
            return new d2.a(n9, i14, n10);
        }
        throw r0.a(null, null);
    }

    public static a8.h t(int i10, ArrayList arrayList) {
        String str;
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList(arrayList);
        Collections.sort(arrayList3, new u.f(4));
        HashSet hashSet2 = new HashSet();
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            a8.h hVar = (a8.h) it.next();
            if (hVar != null && (str = hVar.f199b) != null) {
                if (hVar.B) {
                    if (hashSet2.add(str)) {
                        arrayList2.add(hVar);
                    }
                } else {
                    StringBuilder a10 = p.j.a(str, "|");
                    a10.append(v(hVar.f198a));
                    if (hashSet.add(a10.toString())) {
                        arrayList2.add(hVar);
                    }
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            a8.h hVar2 = (a8.h) it2.next();
            if (hVar2 != null && hVar2.B) {
                arrayList5.add(hVar2);
            } else if (hVar2 != null) {
                arrayList4.add(hVar2);
            }
        }
        a8.h f10 = f(i10, arrayList4);
        if (f10 != null) {
            return f10;
        }
        return f(i10, arrayList5);
    }

    public static HashMap u(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("Origin", "https://movie-box.co");
        if (str == null) {
            str = "";
        }
        hashMap.put("Referer", str);
        if (str2 != null && !str2.isEmpty()) {
            hashMap.put("Cookie", str2);
            hashMap.put("X-MB-Token", str2);
        }
        return hashMap;
    }

    public static int v(String str) {
        if (str == null) {
            return 0;
        }
        try {
            String replaceAll = str.replaceAll("[^0-9]", "");
            if (replaceAll.isEmpty()) {
                return 0;
            }
            return Integer.parseInt(replaceAll);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static long w(j jVar) {
        long j4 = 0;
        if (jVar == null) {
            return 0L;
        }
        if (jVar.h()) {
            return Math.max(0L, jVar.k());
        }
        j[] l10 = jVar.l();
        if (l10 != null) {
            for (j jVar2 : l10) {
                j4 += w(jVar2);
            }
        }
        return j4;
    }

    public static String x(String str) {
        if (str == null) {
            return "video";
        }
        String trim = str.replaceAll("[\\\\/:*?\"<>|]", "_").trim();
        if (trim.isEmpty()) {
            return "video";
        }
        if (trim.length() > 80) {
            return trim.substring(0, 80);
        }
        return trim;
    }

    public void d(int i10) {
        new Handler(Looper.getMainLooper()).post(new m(this, i10, 0));
    }

    public void e(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new m0(1, this, typeface));
    }

    public abstract void q(int i10);

    public abstract void r(Typeface typeface);
}
