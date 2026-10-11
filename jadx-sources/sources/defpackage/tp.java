package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Looper;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.anistation.android.R;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tp implements ys {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public final /* synthetic */ byte x;
    public Object y;
    public Object z;

    public tp() {
        this.x = (byte) 0;
        this.y = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.z = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.A = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.B = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.C = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.D = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static boolean c(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList f(Context context, int i) {
        int c = je6.c(context, R.attr.colorControlHighlight);
        int b = je6.b(context, R.attr.colorButtonNormal);
        int[] iArr = je6.b;
        int[] iArr2 = je6.d;
        int b2 = up0.b(c, i);
        return new ColorStateList(new int[][]{iArr, iArr2, je6.c, je6.f}, new int[]{b, b2, up0.b(c, i), i});
    }

    public static jw3 g(ko4 ko4Var, nw2 nw2Var, jw3 jw3Var, hf6 hf6Var) {
        Object l;
        int i;
        kf6 G0 = ko4Var.G0();
        int x = ko4Var.x();
        if (G0.p()) {
            l = null;
        } else {
            l = G0.l(x);
        }
        if (!ko4Var.h() && !G0.p()) {
            i = G0.f(x, hf6Var, false).b(eq6.U(ko4Var.Z0()) - hf6Var.e);
        } else {
            i = -1;
        }
        int i2 = i;
        for (int i3 = 0; i3 < nw2Var.size(); i3++) {
            jw3 jw3Var2 = (jw3) nw2Var.get(i3);
            if (o(jw3Var2, l, ko4Var.h(), ko4Var.r0(), ko4Var.H(), i2)) {
                return jw3Var2;
            }
        }
        if (!nw2Var.isEmpty() || jw3Var == null || !o(jw3Var, l, ko4Var.h(), ko4Var.r0(), ko4Var.H(), i2)) {
            return null;
        }
        return jw3Var;
    }

    public static LayerDrawable l(h45 h45Var, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable d = h45Var.d(context, R.drawable.abc_star_black_48dp);
        Drawable d2 = h45Var.d(context, R.drawable.abc_star_half_black_48dp);
        if ((d instanceof BitmapDrawable) && d.getIntrinsicWidth() == dimensionPixelSize && d.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) d;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            d.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((d2 instanceof BitmapDrawable) && d2.getIntrinsicWidth() == dimensionPixelSize && d2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) d2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            d2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean o(jw3 jw3Var, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = jw3Var.a;
        int i4 = jw3Var.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (!z || i4 != i || jw3Var.c != i2) {
            if (z || i4 != -1 || jw3Var.e != i3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static r71 q(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = eq6.b;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
            } else {
                qi2.k(qx1.h(readInt2, "Invalid value size: "));
                return null;
            }
        }
        return new r71(hashMap);
    }

    public static void r(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter f;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = up.b;
        }
        PorterDuff.Mode mode2 = up.b;
        synchronized (up.class) {
            f = h45.f(i, mode);
        }
        mutate.setColorFilter(f);
    }

    public static void u(r71 r71Var, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = r71Var.b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.D;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            ze0.m("Property \"autoMetadata\" has not been set");
        }
    }

    public void b(eb2 eb2Var, jw3 jw3Var, kf6 kf6Var) {
        if (jw3Var != null) {
            if (kf6Var.b(jw3Var.a) != -1) {
                eb2Var.y(jw3Var, kf6Var);
                return;
            }
            kf6 kf6Var2 = (kf6) ((t15) this.A).get(jw3Var);
            if (kf6Var2 != null) {
                eb2Var.y(jw3Var, kf6Var2);
            }
        }
    }

    public xx d() {
        String str;
        if (((String) this.y) == null) {
            str = " transportName";
        } else {
            str = "";
        }
        if (((ut1) this.A) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.B) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.C) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.D) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new xx((String) this.y, (Integer) this.z, (ut1) this.A, ((Long) this.B).longValue(), ((Long) this.C).longValue(), (HashMap) this.D);
        }
        ze0.m("Missing required properties:".concat(str));
        return null;
    }

    public kz4 e() {
        d46 d46Var;
        d46 d46Var2;
        Context context;
        cv2 cv2Var;
        is0 is0Var;
        Context context2 = (Context) this.y;
        cv2 cv2Var2 = (cv2) this.z;
        cv2 cv2Var3 = new cv2(cv2Var2.a, cv2Var2.b, cv2Var2.c, cv2Var2.d, cv2Var2.e, cv2Var2.f, cv2Var2.g, cv2Var2.h, cv2Var2.i, cv2Var2.j, cv2Var2.k, cv2Var2.l, cv2Var2.m, new g12(oi4.J(((f12) this.D).a)));
        d46 d46Var3 = new d46(new co2((byte) 6));
        d46 d46Var4 = (d46) this.A;
        if (d46Var4 == null) {
            d46Var = new d46(new vt0(this, (byte) 11));
        } else {
            d46Var = d46Var4;
        }
        d46 d46Var5 = (d46) this.B;
        if (d46Var5 == null) {
            d46Var5 = new d46(new co2((byte) 7));
        }
        is0 is0Var2 = (is0) this.C;
        if (is0Var2 == null) {
            nt1 nt1Var = nt1.x;
            is0Var = new is0(nt1Var, nt1Var, nt1Var, nt1Var, nt1Var);
            d46Var2 = d46Var5;
            context = context2;
            cv2Var = cv2Var3;
        } else {
            d46Var2 = d46Var5;
            context = context2;
            cv2Var = cv2Var3;
            is0Var = is0Var2;
        }
        return new kz4(new hz4(context, cv2Var, d46Var3, d46Var, d46Var2, is0Var));
    }

    public if0 h(String str) {
        return (if0) ((HashMap) this.y).get(str);
    }

    @Override // defpackage.ys
    public at i(qr1 qr1Var, Looper looper, zs zsVar, ex1 ex1Var) {
        switch (this.x) {
            case 5:
                ar3 ar3Var = qr1Var.a;
                Context context = (Context) this.y;
                String f = yu5.f(context, ar3Var);
                if (f != null && qy3.k(f)) {
                    vq3 vq3Var = ar3Var.b;
                    vq3Var.getClass();
                    if (vq3Var.h != -9223372036854775807L) {
                        pz2 pz2Var = (pz2) this.C;
                        if (pz2Var == null) {
                            pz2Var = new pz2((Object) context, this.A, (byte) 29);
                            this.C = pz2Var;
                        }
                        return pz2Var.i(qr1Var, looper, zsVar, ex1Var);
                    }
                }
                tp tpVar = (tp) this.D;
                if (tpVar == null) {
                    tpVar = new tp(context, (c41) this.z, null, (LogSessionId) this.B);
                    this.D = tpVar;
                }
                return tpVar.i(qr1Var, looper, zsVar, ex1Var);
            default:
                Context context2 = (Context) this.y;
                iw3 iw3Var = (iw3) this.A;
                if (iw3Var == null) {
                    qr1Var.getClass();
                    q81 q81Var = new q81();
                    synchronized (q81Var) {
                        q81Var.b = true;
                    }
                    synchronized (q81Var) {
                        q81Var.c = true;
                    }
                    y91 y91Var = new y91(context2, q81Var);
                    y91Var.j = true;
                    iw3Var = y91Var;
                }
                return new dy1(context2, qr1Var, iw3Var, (c41) this.z, ex1Var.a, looper, zsVar, (ab1) this.B, (LogSessionId) this.C, (r91) ((r26) this.D).get());
        }
    }

    public iw3 j(int i) {
        r26 r26Var;
        HashMap hashMap = (HashMap) this.A;
        iw3 iw3Var = (iw3) hashMap.get(Integer.valueOf(i));
        if (iw3Var != null) {
            return iw3Var;
        }
        HashMap hashMap2 = (HashMap) this.z;
        r26 r26Var2 = (r26) hashMap2.get(Integer.valueOf(i));
        if (r26Var2 == null) {
            final o41 o41Var = (o41) this.B;
            o41Var.getClass();
            final byte b = 0;
            if (i != 0) {
                final byte b2 = 1;
                if (i != 1) {
                    final byte b3 = 2;
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                r26Var = new x91(this, o41Var, b);
                            } else {
                                ze0.k(qx1.h(i, "Unrecognized contentType: "));
                                r26Var2 = null;
                            }
                        } else {
                            r26Var = new w91(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(iw3.class), b);
                        }
                    } else {
                        final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(iw3.class);
                        r26Var = new r26() { // from class: v91
                            @Override // defpackage.r26
                            public final Object get() {
                                switch (b3) {
                                    case 0:
                                        return y91.f(asSubclass, o41Var);
                                    case 1:
                                        return y91.f(asSubclass, o41Var);
                                    default:
                                        return y91.f(asSubclass, o41Var);
                                }
                            }
                        };
                    }
                } else {
                    final Class<? extends U> asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(iw3.class);
                    r26Var = new r26() { // from class: v91
                        @Override // defpackage.r26
                        public final Object get() {
                            switch (b2) {
                                case 0:
                                    return y91.f(asSubclass2, o41Var);
                                case 1:
                                    return y91.f(asSubclass2, o41Var);
                                default:
                                    return y91.f(asSubclass2, o41Var);
                            }
                        }
                    };
                }
                r26Var2 = r26Var;
            } else {
                final Class<? extends U> asSubclass3 = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(iw3.class);
                r26Var2 = new r26() { // from class: v91
                    @Override // defpackage.r26
                    public final Object get() {
                        switch (b) {
                            case 0:
                                return y91.f(asSubclass3, o41Var);
                            case 1:
                                return y91.f(asSubclass3, o41Var);
                            default:
                                return y91.f(asSubclass3, o41Var);
                        }
                    }
                };
            }
            hashMap2.put(Integer.valueOf(i), r26Var2);
        }
        iw3 iw3Var2 = (iw3) r26Var2.get();
        st3 st3Var = (st3) this.D;
        if (st3Var != null) {
            iw3Var2.d(st3Var);
        }
        iw3Var2.b((w16) this.C);
        iw3Var2.c();
        iw3Var2.a();
        hashMap.put(Integer.valueOf(i), iw3Var2);
        return iw3Var2;
    }

    public if0 k(String str) {
        int keyAt;
        HashMap hashMap = (HashMap) this.y;
        if0 if0Var = (if0) hashMap.get(str);
        if (if0Var == null) {
            SparseArray sparseArray = (SparseArray) this.z;
            int size = sparseArray.size();
            int i = 0;
            if (size == 0) {
                keyAt = 0;
            } else {
                keyAt = sparseArray.keyAt(size - 1) + 1;
            }
            if (keyAt < 0) {
                while (i < size && i == sparseArray.keyAt(i)) {
                    i++;
                }
                keyAt = i;
            }
            if0 if0Var2 = new if0(keyAt, str, r71.c);
            hashMap.put(str, if0Var2);
            sparseArray.put(keyAt, str);
            ((SparseBooleanArray) this.B).put(keyAt, true);
            ((jf0) this.C).d(if0Var2);
            return if0Var2;
        }
        return if0Var;
    }

    public ColorStateList m(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return t80.I(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return t80.I(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d = je6.d(context, R.attr.colorSwitchThumbNormal);
            if (d != null && d.isStateful()) {
                int[] iArr3 = je6.b;
                iArr[0] = iArr3;
                iArr2[0] = d.getColorForState(iArr3, 0);
                iArr[1] = je6.e;
                iArr2[1] = je6.c(context, R.attr.colorControlActivated);
                iArr[2] = je6.f;
                iArr2[2] = d.getDefaultColor();
            } else {
                iArr[0] = je6.b;
                iArr2[0] = je6.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = je6.e;
                iArr2[1] = je6.c(context, R.attr.colorControlActivated);
                iArr[2] = je6.f;
                iArr2[2] = je6.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return f(context, je6.c(context, R.attr.colorButtonNormal));
        }
        if (i == R.drawable.abc_btn_borderless_material) {
            return f(context, 0);
        }
        if (i == R.drawable.abc_btn_colored_material) {
            return f(context, je6.c(context, R.attr.colorAccent));
        }
        if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
            if (c((int[]) this.z, i)) {
                return je6.d(context, R.attr.colorControlNormal);
            }
            if (c((int[]) this.C, i)) {
                return t80.I(context, R.color.abc_tint_default);
            }
            if (c((int[]) this.D, i)) {
                return t80.I(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return t80.I(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        return t80.I(context, R.color.abc_tint_spinner);
    }

    public void n(long j) {
        jf0 jf0Var;
        SparseArray sparseArray = (SparseArray) this.z;
        HashMap hashMap = (HashMap) this.y;
        jf0 jf0Var2 = (jf0) this.C;
        jf0Var2.i(j);
        jf0 jf0Var3 = (jf0) this.D;
        if (jf0Var3 != null) {
            jf0Var3.i(j);
        }
        if (!jf0Var2.f() && (jf0Var = (jf0) this.D) != null && jf0Var.f()) {
            ((jf0) this.D).j(hashMap, sparseArray);
            jf0Var2.a(hashMap);
        } else {
            jf0Var2.j(hashMap, sparseArray);
        }
        jf0 jf0Var4 = (jf0) this.D;
        if (jf0Var4 != null) {
            jf0Var4.k();
            this.D = null;
        }
    }

    public void p(String str) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.B;
        HashMap hashMap = (HashMap) this.y;
        if0 if0Var = (if0) hashMap.get(str);
        if (if0Var != null && if0Var.c.isEmpty() && if0Var.d.isEmpty()) {
            hashMap.remove(str);
            int i = if0Var.a;
            boolean z = sparseBooleanArray.get(i);
            ((jf0) this.C).c(if0Var, z);
            SparseArray sparseArray = (SparseArray) this.z;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.A).put(i, true);
            }
        }
    }

    public void s() {
        ((jf0) this.C).g((HashMap) this.y);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.A;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.z).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.B).clear();
    }

    public void t(kf6 kf6Var) {
        nw2 nw2Var;
        eb2 a = rw2.a();
        if (((nw2) this.z).isEmpty()) {
            b(a, (jw3) this.C, kf6Var);
            if (!Objects.equals((jw3) this.D, (jw3) this.C)) {
                b(a, (jw3) this.D, kf6Var);
            }
            if (!Objects.equals((jw3) this.B, (jw3) this.C) && !Objects.equals((jw3) this.B, (jw3) this.D)) {
                b(a, (jw3) this.B, kf6Var);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((nw2) this.z).size();
                nw2Var = (nw2) this.z;
                if (i >= size) {
                    break;
                }
                b(a, (jw3) nw2Var.get(i), kf6Var);
                i++;
            }
            if (!nw2Var.contains((jw3) this.B)) {
                b(a, (jw3) this.B, kf6Var);
            }
        }
        this.A = a.e(true);
    }

    public void v(String str) {
        xt5.j(c58.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        xt5.j(!c58.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.A = str;
    }

    public void w(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = c58.a;
        this.C = str;
    }

    public Uri x() {
        boolean z;
        boolean z2;
        boolean z3;
        String q;
        String concat;
        String str = (String) this.z;
        String str2 = (String) this.A;
        Account account = v48.a;
        Account account2 = (Account) this.B;
        if (account2.type.indexOf(58) == -1) {
            z = true;
        } else {
            z = false;
        }
        xt5.j(z, "Account type contains ':'.", new Object[0]);
        if (account2.type.indexOf(47) == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        xt5.j(z2, "Account type contains '/'.", new Object[0]);
        if (account2.name.indexOf(47) == -1) {
            z3 = true;
        } else {
            z3 = false;
        }
        xt5.j(z3, "Account name contains '/'.", new Object[0]);
        if (v48.a.equals(account2)) {
            q = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            q = qx1.q(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.C;
        StringBuilder sb = new StringBuilder(q.length() + str2.length() + str.length() + 2 + 1 + 1 + str5.length());
        qx1.x(sb, "/", str, "/", str2);
        String l = h11.l(sb, "/", q, "/", str5);
        o15 g = ((jw2) this.D).g();
        Pattern pattern = p58.a;
        if (g.isEmpty()) {
            concat = null;
        } else {
            concat = "transform=".concat(new tv("+", (byte) 2).d(g));
        }
        return new Uri.Builder().scheme(AndroidStaticDeviceInfoDataSource.PLATFORM_ANDROID).authority((String) this.y).path(l).encodedFragment(concat).build();
    }

    public tp(Set set, String str, String str2) {
        this.x = (byte) 3;
        Set unmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.y = unmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.A = str;
        this.B = str2;
        this.C = no5.b;
        HashSet hashSet = new HashSet(unmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.z = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw qx1.f(it);
    }

    public tp(i18 i18Var, dc5 dc5Var, im0 im0Var, qx4 qx4Var, li4 li4Var) {
        this.x = (byte) 11;
        i18Var.getClass();
        this.y = i18Var;
        this.z = dc5Var;
        this.A = im0Var;
        this.B = qx4Var;
        this.C = li4Var;
        f73.a(im0Var);
        Objects.toString(qx4Var);
    }

    public /* synthetic */ tp(byte b) {
        this.x = b;
    }

    public tp(Context context, c41 c41Var, LogSessionId logSessionId) {
        this.x = (byte) 5;
        this.y = context.getApplicationContext();
        this.z = c41Var;
        this.B = logSessionId;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        ad adVar = new ad(context);
        adVar.A = kb0.D(Executors.newSingleThreadExecutor());
        adVar.B = options;
        adVar.y = CodedOutputStream.DEFAULT_BUFFER_SIZE;
        this.A = new r41(adVar);
    }

    public tp(Context context, byte b) {
        this.x = b;
        switch (b) {
            case 13:
                this.z = "files";
                this.A = "common";
                this.B = c58.b;
                this.C = "";
                this.D = nw2.k();
                this.y = context.getPackageName();
                return;
            default:
                this.y = context.getApplicationContext();
                this.z = cv2.o;
                this.A = null;
                this.B = null;
                this.C = null;
                this.D = new f12();
                return;
        }
    }

    public tp(mp3 mp3Var, MediaFormat mediaFormat, ea2 ea2Var, Surface surface, MediaCrypto mediaCrypto, y23 y23Var) {
        this.x = (byte) 10;
        this.y = mp3Var;
        this.z = mediaFormat;
        this.A = ea2Var;
        this.B = surface;
        this.C = mediaCrypto;
        this.D = y23Var;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, zp2] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, qb0] */
    public tp(cx5 cx5Var, File file) {
        this.x = (byte) 2;
        this.y = new HashMap();
        this.z = new SparseArray();
        this.A = new SparseBooleanArray();
        this.B = new SparseBooleanArray();
        ?? obj = new Object();
        obj.x = cx5Var;
        obj.y = new SparseArray();
        File file2 = new File(file, "cached_content_index.exi");
        ?? obj2 = new Object();
        obj2.y = null;
        obj2.z = null;
        obj2.A = new rt3(file2);
        this.C = obj;
        this.D = obj2;
    }

    public tp(Context context, c41 c41Var, y91 y91Var, LogSessionId logSessionId) {
        this.x = (byte) 7;
        this.y = context;
        this.z = c41Var;
        this.A = y91Var;
        gb1 gb1Var = new gb1();
        gb1Var.G = true;
        gb1Var.N = false;
        this.B = new ab1(new hb1(gb1Var));
        this.C = logSessionId;
        this.D = new xw((byte) 3);
    }

    public tp(u76 u76Var) {
        this.x = (byte) 8;
        u76Var.getClass();
        this.y = u76Var;
        this.D = xo2.a;
    }

    public tp(e12 e12Var, p18 p18Var) {
        this.x = (byte) 6;
        this.y = e12Var;
        this.C = p18Var;
        this.z = new HashMap();
        this.A = new HashMap();
    }

    public tp(hf6 hf6Var) {
        this.x = (byte) 4;
        this.y = hf6Var;
        z62 z62Var = nw2.y;
        this.z = o15.B;
        this.A = t15.D;
    }
}
