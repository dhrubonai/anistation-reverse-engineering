package com.bumptech.glide;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.p0;
import androidx.lifecycle.w;
import androidx.lifecycle.w0;
import f1.b0;
import f1.t;
import h8.r;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;
import k9.v;
import msr.pistream.app.R;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.ui.player.PlayerActivity;
import org.xmlpull.v1.XmlPullParser;
import p7.a0;
import p7.a1;
import p7.d0;
import p7.e1;
import p7.k0;
import p7.k1;
import p7.l1;
import p7.p1;
import r6.h0;
import r6.m0;
import r6.n1;
import r6.o0;
import r6.y0;
import r6.z0;
import t7.x;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2177a = {1, 2, 3, 6};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f2178b = {48000, 44100, 32000};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f2179c = {24000, 22050, 16000};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f2180d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f2181e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f2182f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f2183x = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f2184y = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: z, reason: collision with root package name */
    public static final String[] f2185z = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};
    public static final boolean[] A = new boolean[3];
    public static final String[] B = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static String A(Context context) {
        return b0(context).getString("subtitle_default_language", "English");
    }

    public static int B(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static /* synthetic */ k0 C(a1 a1Var, boolean z9, e1 e1Var, int i10) {
        boolean z10 = false;
        if ((i10 & 1) != 0) {
            z9 = false;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return ((k1) a1Var).F(z9, z10, e1Var);
    }

    public static final boolean D(AssertionError assertionError) {
        boolean z9;
        Logger logger = k9.n.f6536a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z9 = o7.j.j1(message, "getsockname failed");
        } else {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        return true;
    }

    public static boolean E(Throwable th) {
        if (b0.f3799a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static boolean F(Throwable th) {
        if (b0.f3799a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(")) {
            return true;
        }
        return false;
    }

    public static boolean G(Context context) {
        return b0(context).getBoolean("frame_capture_always_visible", false);
    }

    public static boolean H(Context context) {
        return b0(context).getBoolean("frame_capture_enabled", true);
    }

    public static boolean I(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c0.o.a(context);
        }
        return true;
    }

    public static final boolean J(char c6) {
        if (!Character.isWhitespace(c6) && !Character.isSpaceChar(c6)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(java.util.List r8, z6.e r9) {
        /*
            boolean r0 = r9 instanceof p7.f
            if (r0 == 0) goto L13
            r0 = r9
            p7.f r0 = (p7.f) r0
            int r1 = r0.f8678c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8678c = r1
            goto L18
        L13:
            p7.f r0 = new p7.f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f8677b
            a7.a r1 = a7.a.f156a
            int r2 = r0.f8678c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r8 = r0.f8676a
            r6.h0.V0(r9)
            goto L38
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            r6.h0.V0(r9)
            java.util.Iterator r8 = r8.iterator()
        L38:
            boolean r9 = r8.hasNext()
            w6.f r2 = w6.f.f11019a
            if (r9 == 0) goto Laa
            java.lang.Object r9 = r8.next()
            p7.a1 r9 = (p7.a1) r9
            r0.f8676a = r8
            r0.f8678c = r3
            p7.k1 r9 = (p7.k1) r9
        L4c:
            java.lang.Object r4 = r9.B()
            boolean r5 = r4 instanceof p7.x0
            r6 = 0
            if (r5 != 0) goto L57
            r4 = r6
            goto L5e
        L57:
            int r4 = r9.P(r4)
            if (r4 < 0) goto L4c
            r4 = r3
        L5e:
            if (r4 != 0) goto L7c
            z6.i r9 = r0.getContext()
            androidx.lifecycle.q0 r4 = androidx.lifecycle.q0.f1134x
            z6.g r9 = r9.r(r4)
            p7.a1 r9 = (p7.a1) r9
            if (r9 == 0) goto La7
            boolean r4 = r9.a()
            if (r4 == 0) goto L75
            goto La7
        L75:
            p7.k1 r9 = (p7.k1) r9
            java.util.concurrent.CancellationException r8 = r9.s()
            throw r8
        L7c:
            p7.j r4 = new p7.j
            z6.e r5 = com.bumptech.glide.d.F(r0)
            r4.<init>(r3, r5)
            r4.t()
            p7.m0 r5 = new p7.m0
            r7 = 3
            r5.<init>(r4, r7)
            p7.k0 r9 = r9.F(r6, r3, r5)
            p7.l0 r5 = new p7.l0
            r5.<init>(r9, r6)
            r4.v(r5)
            java.lang.Object r9 = r4.s()
            a7.a r4 = a7.a.f156a
            if (r9 != r4) goto La3
            goto La4
        La3:
            r9 = r2
        La4:
            if (r9 != r4) goto La7
            r2 = r9
        La7:
            if (r2 != r1) goto L38
            return r1
        Laa:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.K(java.util.List, z6.e):java.lang.Object");
    }

    public static final List L(Object obj) {
        List singletonList = Collections.singletonList(obj);
        h0.s(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static final List M(Object... objArr) {
        h0.u(objArr, "elements");
        if (objArr.length > 0) {
            return x6.i.g1(objArr);
        }
        return x6.o.f11318a;
    }

    public static ArrayList N(Object... objArr) {
        int length = objArr.length;
        h0.p(length, "arraySize");
        ArrayList arrayList = new ArrayList(d.X(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static void O(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }

    public static q2.f R(int i10, t tVar) {
        int f10 = tVar.f();
        if (tVar.f() == 1684108385) {
            tVar.H(8);
            String q9 = tVar.q(f10 - 16);
            return new q2.f("und", q9, q9);
        }
        f1.o.f("MetadataUtil", "Failed to parse comment attribute: " + i1.a.f(i10));
        return null;
    }

    public static q2.a S(t tVar) {
        String str;
        int f10 = tVar.f();
        if (tVar.f() == 1684108385) {
            int f11 = tVar.f() & 16777215;
            if (f11 == 13) {
                str = "image/jpeg";
            } else if (f11 == 14) {
                str = "image/png";
            } else {
                str = null;
            }
            if (str == null) {
                a3.g.A("Unrecognized cover art flags: ", f11, "MetadataUtil");
                return null;
            }
            tVar.H(4);
            int i10 = f10 - 16;
            byte[] bArr = new byte[i10];
            tVar.d(bArr, 0, i10);
            return new q2.a(3, str, null, bArr);
        }
        f1.o.f("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static q2.o T(int i10, t tVar, String str) {
        int f10 = tVar.f();
        if (tVar.f() == 1684108385 && f10 >= 22) {
            tVar.H(10);
            int A2 = tVar.A();
            if (A2 > 0) {
                String n9 = a3.g.n("", A2);
                int A3 = tVar.A();
                if (A3 > 0) {
                    n9 = n9 + "/" + A3;
                }
                return new q2.o(str, null, o0.o(n9));
            }
        }
        f1.o.f("MetadataUtil", "Failed to parse index/count attribute: " + i1.a.f(i10));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (java.lang.Integer.parseInt(r9) == 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        if (r7 == (-1)) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static k2.c U(java.lang.String r20) {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r20
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = p7.a0.L(r0, r1)
            r3 = 0
            if (r2 == 0) goto Ld6
            r6.m0 r2 = r6.o0.f9505b
            r6.n1 r2 = r6.n1.f9497e
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = p7.a0.L(r0, r8)
            if (r8 == 0) goto La2
            java.lang.String[] r2 = com.bumptech.glide.c.f2183x
            r6 = 0
            r7 = r6
        L37:
            r8 = 4
            if (r7 >= r8) goto L4d
            r9 = r2[r7]
            java.lang.String r9 = p7.a0.t(r0, r9)
            if (r9 == 0) goto L4a
            int r2 = java.lang.Integer.parseInt(r9)
            r7 = 1
            if (r2 != r7) goto L4d
            goto L4e
        L4a:
            int r7 = r7 + 1
            goto L37
        L4d:
            r7 = r6
        L4e:
            if (r7 != 0) goto L51
            return r3
        L51:
            java.lang.String[] r2 = com.bumptech.glide.c.f2184y
            r7 = r6
        L54:
            if (r7 >= r8) goto L6c
            r9 = r2[r7]
            java.lang.String r9 = p7.a0.t(r0, r9)
            if (r9 == 0) goto L69
            long r7 = java.lang.Long.parseLong(r9)
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L6d
            goto L6c
        L69:
            int r7 = r7 + 1
            goto L54
        L6c:
            r7 = r4
        L6d:
            java.lang.String[] r2 = com.bumptech.glide.c.f2185z
        L6f:
            r9 = 2
            if (r6 >= r9) goto L9c
            r9 = r2[r6]
            java.lang.String r9 = p7.a0.t(r0, r9)
            if (r9 == 0) goto L99
            long r12 = java.lang.Long.parseLong(r9)
            k2.b r2 = new k2.b
            java.lang.String r15 = "image/jpeg"
            r16 = 0
            r18 = 0
            r14 = r2
            r14.<init>(r15, r16, r18)
            k2.b r6 = new k2.b
            java.lang.String r11 = "video/mp4"
            r14 = 0
            r10 = r6
            r10.<init>(r11, r12, r14)
            r6.n1 r2 = r6.o0.p(r2, r6)
            goto La0
        L99:
            int r6 = r6 + 1
            goto L6f
        L9c:
            r6.m0 r2 = r6.o0.f9505b
            r6.n1 r2 = r6.n1.f9497e
        La0:
            r6 = r7
            goto Lc3
        La2:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = p7.a0.L(r0, r8)
            if (r8 == 0) goto Lb3
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            r6.n1 r2 = V(r0, r2, r8)
            goto Lc3
        Lb3:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = p7.a0.L(r0, r8)
            if (r8 == 0) goto Lc3
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            r6.n1 r2 = V(r0, r2, r8)
        Lc3:
            boolean r8 = p7.a0.H(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld0
            return r3
        Ld0:
            k2.c r0 = new k2.c
            r0.<init>(r6, r2)
            return r0
        Ld6:
            java.lang.String r0 = "Couldn't find xmp metadata"
            c1.r0 r0 = c1.r0.a(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.U(java.lang.String):k2.c");
    }

    public static n1 V(XmlPullParser xmlPullParser, String str, String str2) {
        long j4;
        long j10;
        m0 m0Var = o0.f9505b;
        h0.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        int i10 = 0;
        do {
            xmlPullParser.next();
            if (a0.L(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String t9 = a0.t(xmlPullParser, concat3);
                String t10 = a0.t(xmlPullParser, concat4);
                String t11 = a0.t(xmlPullParser, concat5);
                String t12 = a0.t(xmlPullParser, concat6);
                if (t9 != null && t10 != null) {
                    if (t11 != null) {
                        j4 = Long.parseLong(t11);
                    } else {
                        j4 = 0;
                    }
                    if (t12 != null) {
                        j10 = Long.parseLong(t12);
                    } else {
                        j10 = 0;
                    }
                    k2.b bVar = new k2.b(t9, j4, j10);
                    int i11 = i10 + 1;
                    if (objArr.length < i11) {
                        objArr = Arrays.copyOf(objArr, q6.g.y(objArr.length, i11));
                    }
                    objArr[i10] = bVar;
                    i10 = i11;
                } else {
                    return n1.f9497e;
                }
            }
        } while (!a0.H(xmlPullParser, concat2));
        return o0.h(i10, objArr);
    }

    public static q2.o W(int i10, t tVar, String str) {
        int f10 = tVar.f();
        if (tVar.f() == 1684108385) {
            tVar.H(8);
            return new q2.o(str, null, o0.o(tVar.q(f10 - 16)));
        }
        f1.o.f("MetadataUtil", "Failed to parse text attribute: " + i1.a.f(i10));
        return null;
    }

    public static q2.k X(int i10, String str, t tVar, boolean z9, boolean z10) {
        int Y = Y(tVar);
        if (z10) {
            Y = Math.min(1, Y);
        }
        if (Y >= 0) {
            if (z9) {
                return new q2.o(str, null, o0.o(Integer.toString(Y)));
            }
            return new q2.f("und", str, Integer.toString(Y));
        }
        f1.o.f("MetadataUtil", "Failed to parse uint8 attribute: " + i1.a.f(i10));
        return null;
    }

    public static int Y(t tVar) {
        tVar.H(4);
        if (tVar.f() == 1684108385) {
            tVar.H(8);
            return tVar.v();
        }
        f1.o.f("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    public static ImageView Z(int i10, Context context, Runnable runnable) {
        return a0(context, i10, runnable, 8);
    }

    public static ImageView a0(Context context, int i10, Runnable runnable, int i11) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(i10);
        imageView.clearColorFilter();
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int e10 = w8.i.e(context, i11);
        imageView.setPadding(e10, e10, e10, e10);
        imageView.setBackgroundResource(R.drawable.ripple_circle);
        w8.i.c(imageView);
        imageView.setOnClickListener(new j8.c(runnable, 6));
        return imageView;
    }

    public static void b(MainActivity mainActivity, LinearLayout linearLayout, String str, String str2) {
        LinearLayout linearLayout2 = new LinearLayout(mainActivity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(w8.i.e(mainActivity, 14), w8.i.e(mainActivity, 12), w8.i.e(mainActivity, 14), w8.i.e(mainActivity, 12));
        linearLayout2.setBackgroundDrawable(w8.i.j(w8.i.f11064d, w8.i.e(mainActivity, 12)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, w8.i.e(mainActivity, 8));
        linearLayout.addView(linearLayout2, layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(mainActivity);
        linearLayout3.setOrientation(1);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        r.f.i(-2, -2, linearLayout3, w8.i.l(mainActivity, str, 14, -1, 1));
        TextView l10 = w8.i.l(mainActivity, str2, 12, w8.i.f11068h, 0);
        l10.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(0, w8.i.e(mainActivity, 3), 0, 0);
        linearLayout3.addView(l10, layoutParams2);
        TextView l11 = w8.i.l(mainActivity, "Copy", 13, w8.i.f11065e, 1);
        l11.setPadding(w8.i.e(mainActivity, 14), w8.i.e(mainActivity, 6), w8.i.e(mainActivity, 14), w8.i.e(mainActivity, 6));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(w8.i.e(mainActivity, 8));
        gradientDrawable.setColor(Color.argb(30, 255, 255, 255));
        l11.setBackground(new RippleDrawable(ColorStateList.valueOf(Color.argb(60, 255, 255, 255)), gradientDrawable, null));
        l11.setOnClickListener(new r(13, mainActivity, str2));
        r.f.i(-2, -2, linearLayout2, l11);
    }

    public static SharedPreferences b0(Context context) {
        return context.getApplicationContext().getSharedPreferences("pistream_storage", 0);
    }

    public static final void c(w0 w0Var, n3.e eVar, androidx.lifecycle.p pVar) {
        boolean z9;
        h0.u(eVar, "registry");
        h0.u(pVar, "lifecycle");
        p0 p0Var = (p0) w0Var.getTag("androidx.lifecycle.savedstate.vm.tag");
        if (p0Var != null && !p0Var.f1127c) {
            p0Var.a(pVar, eVar);
            androidx.lifecycle.o oVar = ((w) pVar).f1156c;
            if (oVar != androidx.lifecycle.o.INITIALIZED) {
                if (oVar.compareTo(androidx.lifecycle.o.STARTED) >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9) {
                    pVar.a(new androidx.lifecycle.g(pVar, eVar));
                    return;
                }
            }
            eVar.d();
        }
    }

    public static void c0(Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 29) {
            y.o.a(theme);
            return;
        }
        synchronized (y.n.f11445a) {
            if (!y.n.f11447c) {
                try {
                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                    y.n.f11446b = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e10) {
                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e10);
                }
                y.n.f11447c = true;
            }
            Method method = y.n.f11446b;
            if (method != null) {
                try {
                    method.invoke(theme, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException e11) {
                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e11);
                    y.n.f11446b = null;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object d(d0[] d0VarArr, z6.e eVar) {
        boolean z9;
        int P;
        if (d0VarArr.length == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return x6.o.f11318a;
        }
        p7.e eVar2 = new p7.e(d0VarArr);
        p7.j jVar = new p7.j(1, d.F(eVar));
        jVar.t();
        int length = d0VarArr.length;
        p7.c[] cVarArr = new p7.c[length];
        for (int i10 = 0; i10 < length; i10++) {
            k1 k1Var = (k1) d0VarArr[i10];
            do {
                P = k1Var.P(k1Var.B());
                if (P != 0) {
                }
                p7.c cVar = new p7.c(eVar2, jVar);
                cVar.f8667f = k1Var.F(false, true, cVar);
                cVarArr[i10] = cVar;
            } while (P != 1);
            p7.c cVar2 = new p7.c(eVar2, jVar);
            cVar2.f8667f = k1Var.F(false, true, cVar2);
            cVarArr[i10] = cVar2;
        }
        p7.d dVar = new p7.d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            p7.c cVar3 = cVarArr[i11];
            cVar3.getClass();
            p7.c.f8665y.set(cVar3, dVar);
        }
        if (!(p7.j.f8698x.get(jVar) instanceof p1)) {
            dVar.b();
        } else {
            jVar.v(dVar);
        }
        Object s9 = jVar.s();
        a7.a aVar = a7.a.f156a;
        return s9;
    }

    public static final Object d0(Object obj) {
        if (obj instanceof p7.t) {
            return h0.F(((p7.t) obj).f8743a);
        }
        return obj;
    }

    public static h1.l e(n1.m mVar, String str, n1.j jVar, int i10) {
        h1.k kVar = new h1.k();
        kVar.f4589a = jVar.b(str);
        kVar.f4592d = jVar.f7951a;
        kVar.f4593e = jVar.f7952b;
        String a10 = mVar.a();
        if (a10 == null) {
            a10 = jVar.b(((n1.b) mVar.f7960b.get(0)).f7904a).toString();
        }
        kVar.d(a10);
        kVar.b(i10);
        kVar.c();
        return kVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        if (r5 != (-1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        l0(r12, r1, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r13[r5] = (r9 & r11) | (r13[r5] & r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e0(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = r6.h0.K0(r9)
            r1 = r0 & r11
            int r2 = k0(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + r3
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3a
            r7 = r14[r2]
            boolean r7 = q6.g.x(r9, r7)
            if (r7 == 0) goto L3a
            if (r15 == 0) goto L2a
            r7 = r15[r2]
            boolean r7 = q6.g.x(r10, r7)
            if (r7 == 0) goto L3a
        L2a:
            r9 = r6 & r11
            if (r5 != r3) goto L32
            l0(r12, r1, r9)
            goto L39
        L32:
            r10 = r13[r5]
            r10 = r10 & r4
            r9 = r9 & r11
            r9 = r9 | r10
            r13[r5] = r9
        L39:
            return r2
        L3a:
            r5 = r6 & r11
            if (r5 != 0) goto L3f
            return r3
        L3f:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.e0(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static String f(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b10)));
        }
        return sb.toString();
    }

    public static GradientDrawable f0(Context context, int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(w8.i.e(context, 2));
        gradientDrawable.setSize(1, w8.i.e(context, 3));
        return gradientDrawable;
    }

    public static ImageView g(Context context, int i10, int i11, Runnable runnable) {
        ImageView Z = Z(i10, context, runnable);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(w8.i.e(context, 44), w8.i.e(context, 44), 17);
        if (i11 > 0) {
            layoutParams.setMargins(w8.i.e(context, i11), 0, 0, 0);
        } else if (i11 < 0) {
            layoutParams.setMargins(0, 0, w8.i.e(context, -i11), 0);
        }
        Z.setLayoutParams(layoutParams);
        return Z;
    }

    public static void g0(Context context, boolean z9) {
        b0(context).edit().putBoolean("subtitle_bg_none", z9).apply();
    }

    public static void h(String str, long j4) {
        if (j4 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " (" + j4 + ") must be >= 0");
    }

    public static final k9.c h0(Socket socket) {
        Logger logger = k9.n.f6536a;
        v vVar = new v(socket);
        OutputStream outputStream = socket.getOutputStream();
        h0.s(outputStream, "getOutputStream(...)");
        return new k9.c(vVar, new k9.c(outputStream, vVar));
    }

    public static final void i(int i10) {
        boolean z9;
        l7.f fVar = new l7.f(2, 36);
        if (2 <= i10 && i10 <= fVar.f6883b) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return;
        }
        StringBuilder u9 = a3.g.u("radix ", i10, " was not in valid range ");
        u9.append(new l7.f(2, 36));
        throw new IllegalArgumentException(u9.toString());
    }

    public static final k9.d i0(Socket socket) {
        Logger logger = k9.n.f6536a;
        v vVar = new v(socket);
        InputStream inputStream = socket.getInputStream();
        h0.s(inputStream, "getInputStream(...)");
        return new k9.d(vVar, new k9.d(inputStream, vVar));
    }

    public static int j(Context context, String str) {
        boolean z9;
        int c6;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String d10 = w.j.d(str);
        if (d10 != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && f0.b.a(packageName2, packageName)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager c10 = w.k.c(context);
                    c6 = w.k.a(c10, d10, Binder.getCallingUid(), packageName);
                    if (c6 == 0) {
                        c6 = w.k.a(c10, d10, myUid, w.k.b(context));
                    }
                } else {
                    c6 = w.j.c((AppOpsManager) w.j.a(context, AppOpsManager.class), d10, packageName);
                }
            } else {
                c6 = w.j.c((AppOpsManager) w.j.a(context, AppOpsManager.class), d10, packageName);
            }
            if (c6 != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static final Object j0(t7.w wVar, t7.w wVar2, h7.p pVar) {
        Object tVar;
        Object I;
        try {
            q6.g.e(pVar);
            tVar = pVar.invoke(wVar2, wVar);
        } catch (Throwable th) {
            tVar = new p7.t(th, false);
        }
        a7.a aVar = a7.a.f156a;
        if (tVar != aVar && (I = wVar.I(tVar)) != l1.f8715b) {
            if (!(I instanceof p7.t)) {
                return l1.a(I);
            }
            throw ((p7.t) I).f8743a;
        }
        return aVar;
    }

    public static int k(int i10, int i11, int i12) {
        return i10 < i11 ? i11 : i10 > i12 ? i12 : i10;
    }

    public static int k0(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i10] & 65535;
        }
        return ((int[]) obj)[i10];
    }

    public static ImageView l(int i10, PlayerActivity playerActivity, Runnable runnable) {
        ImageView imageView = new ImageView(playerActivity);
        imageView.setImageResource(i10);
        imageView.setColorFilter(-1);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(w8.i.e(playerActivity, 8), w8.i.e(playerActivity, 8), w8.i.e(playerActivity, 8), w8.i.e(playerActivity, 8));
        if (i10 == R.drawable.ic_cast_button_static) {
            imageView.clearColorFilter();
        }
        imageView.setBackgroundResource(R.drawable.ripple_circle);
        w8.i.c(imageView);
        imageView.setOnClickListener(new j8.c(runnable, 7));
        return imageView;
    }

    public static void l0(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] m(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = iArr[i10];
            }
            return jArr;
        }
        if (serializable instanceof long[]) {
            return (long[]) serializable;
        }
        return null;
    }

    public static LinearLayout.LayoutParams m0(Context context) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(w8.i.e(context, 42), w8.i.e(context, 42));
        layoutParams.setMargins(0, 0, w8.i.e(context, 8), 0);
        return layoutParams;
    }

    public static Object n(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            if (i10 <= 256) {
                return new byte[i10];
            }
            if (i10 <= 65536) {
                return new short[i10];
            }
            return new int[i10];
        }
        throw new IllegalArgumentException(a3.g.n("must be power of 2 between 2^1 and 2^30: ", i10));
    }

    public static AbstractList n0(h3.e eVar, List list) {
        if (list instanceof RandomAccess) {
            return new y0(eVar, list);
        }
        return new z0(eVar, list);
    }

    public static String o(Uri uri) {
        int i10;
        if (uri == null) {
            return "No folder selected";
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null || lastPathSegment.trim().isEmpty()) {
            return "Selected folder";
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(58);
        if (lastIndexOf >= 0 && (i10 = lastIndexOf + 1) < lastPathSegment.length()) {
            lastPathSegment = lastPathSegment.substring(i10);
        }
        if (lastPathSegment.isEmpty()) {
            return "Selected folder";
        }
        return lastPathSegment;
    }

    public static Uri p(Context context) {
        String string = b0(context).getString("download_dir_uri", "");
        if (string != null && !string.trim().isEmpty()) {
            return Uri.parse(string);
        }
        return null;
    }

    public static final boolean q(char c6, char c10, boolean z9) {
        if (c6 == c10) {
            return true;
        }
        if (!z9) {
            return false;
        }
        char upperCase = Character.toUpperCase(c6);
        char upperCase2 = Character.toUpperCase(c10);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static String r(long j4) {
        if (j4 < 1024) {
            return j4 + "B";
        }
        if (j4 < 1048576) {
            return (j4 / 1024) + "KB";
        }
        if (j4 < 1073741824) {
            return String.format("%.1fMB", Float.valueOf(((float) j4) / 1048576.0f));
        }
        return String.format("%.2fGB", Float.valueOf(((float) j4) / 1.0737418E9f));
    }

    public static Uri s(Context context) {
        String string = b0(context).getString("frame_dir_uri", "");
        if (string != null && !string.trim().isEmpty()) {
            return Uri.parse(string);
        }
        return null;
    }

    public static int t(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0 && i10 < 3 && i11 >= 0 && i12 < 19) {
            int i13 = f2178b[i10];
            if (i13 == 44100) {
                return ((i11 % 2) + f2182f[i12]) * 2;
            }
            int i14 = f2181e[i12];
            if (i13 == 32000) {
                return i14 * 6;
            }
            return i14 * 4;
        }
        return -1;
    }

    public static int u(Context context) {
        int i10 = 1;
        int i11 = b0(context).getInt("download_parallel", 1);
        if (i11 >= 1) {
            i10 = i11;
        }
        if (i10 > 3) {
            return 3;
        }
        return i10;
    }

    public static int v(Context context) {
        return b0(context).getInt("download_quality", 720);
    }

    public static final int w(List list) {
        h0.u(list, "<this>");
        return list.size() - 1;
    }

    public static byte[] x(Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo c6 = j5.b.a(context).c(64, str);
        Signature[] signatureArr = c6.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i10 = 0;
            while (true) {
                if (i10 < 2) {
                    try {
                        messageDigest = MessageDigest.getInstance("SHA1");
                    } catch (NoSuchAlgorithmException unused) {
                    }
                    if (messageDigest != null) {
                        break;
                    }
                    i10++;
                } else {
                    messageDigest = null;
                    break;
                }
            }
            if (messageDigest != null) {
                return messageDigest.digest(c6.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static int y(Context context) {
        return b0(context).getInt("player_seek_duration_ms", 10000);
    }

    public static final x z(Object obj) {
        if (obj != t7.d.f10055a) {
            h0.r(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (x) obj;
        }
        throw new IllegalStateException("Does not contain segment".toString());
    }

    public abstract View P(int i10);

    public abstract boolean Q();
}
