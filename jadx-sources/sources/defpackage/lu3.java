package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class lu3 implements vu3 {
    public final /* synthetic */ wu3 a;
    public final /* synthetic */ jq3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ lu3(wu3 wu3Var, jq3 jq3Var, int i) {
        this.a = wu3Var;
        this.b = jq3Var;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [st3, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [qq3, pq3] */
    @Override // defpackage.vu3
    public final void a(dt3 dt3Var) {
        byte[] bArr;
        jq3 jq3Var = this.b;
        if (TextUtils.isEmpty(jq3Var.x)) {
            kb0.O("MediaSessionLegacyStub", "onAddQueueItem(): Media ID shouldn't be empty");
            return;
        }
        int i = of3.a;
        String str = jq3Var.x;
        oq3 oq3Var = new oq3();
        rq3 rq3Var = new rq3();
        List list = Collections.EMPTY_LIST;
        z62 z62Var = nw2.y;
        o15 o15Var = o15.B;
        tq3 tq3Var = new tq3();
        wq3 wq3Var = wq3.d;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ?? obj = new Object();
        obj.x = jq3Var.F;
        wq3 wq3Var2 = new wq3(obj);
        CharSequence charSequence = jq3Var.y;
        hr3 hr3Var = new hr3();
        hr3Var.f = jq3Var.z;
        hr3Var.g = jq3Var.A;
        hr3Var.n = jq3Var.D;
        Bundle bundle = null;
        hr3Var.i = of3.c(null);
        Bitmap bitmap = jq3Var.B;
        if (bitmap == null) {
            bArr = null;
        } else {
            if (jq3Var.C == null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                        jq3Var.C = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } catch (IOException e) {
                    kb0.P("MediaDescriptionCompat", "Failed to compress MediaDescriptionCompat artwork", e);
                }
            }
            bArr = jq3Var.C;
        }
        int i2 = 3;
        if (bArr != null) {
            hr3Var.c(bArr, 3);
        }
        Bundle bundle2 = jq3Var.E;
        if (bundle2 != null) {
            bundle = new Bundle(bundle2);
        }
        boolean z = true;
        if (bundle != null && bundle.containsKey("android.media.extra.BT_FOLDER_TYPE")) {
            long j = bundle.getLong("android.media.extra.BT_FOLDER_TYPE");
            if (j != 0) {
                if (j == 1) {
                    i2 = 1;
                } else if (j == 2) {
                    i2 = 2;
                } else if (j != 3) {
                    if (j == 4) {
                        i2 = 4;
                    } else if (j == 5) {
                        i2 = 5;
                    } else if (j == 6) {
                        i2 = 6;
                    }
                }
                hr3Var.q = Integer.valueOf(i2);
                bundle.remove("android.media.extra.BT_FOLDER_TYPE");
            }
            i2 = 0;
            hr3Var.q = Integer.valueOf(i2);
            bundle.remove("android.media.extra.BT_FOLDER_TYPE");
        }
        hr3Var.r = Boolean.FALSE;
        if (bundle != null && bundle.containsKey("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT")) {
            hr3Var.I = Integer.valueOf((int) bundle.getLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT"));
            bundle.remove("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null && bundle.containsKey("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST")) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST");
            stringArrayList.getClass();
            hr3Var.K = nw2.o(nw2.o(stringArrayList));
        }
        if (bundle != null && bundle.containsKey("androidx.media3.mediadescriptioncompat.title")) {
            hr3Var.a = bundle.getCharSequence("androidx.media3.mediadescriptioncompat.title");
            hr3Var.e = charSequence;
            bundle.remove("androidx.media3.mediadescriptioncompat.title");
        } else {
            hr3Var.a = charSequence;
        }
        if (bundle != null && !bundle.isEmpty()) {
            hr3Var.J = bundle;
        }
        hr3Var.s = Boolean.TRUE;
        jr3 jr3Var = new jr3(hr3Var);
        if (((Uri) rq3Var.e) != null && ((UUID) rq3Var.d) == null) {
            z = false;
        }
        io3.B(z);
        ar3 ar3Var = new ar3(str2, new pq3(oq3Var), null, new uq3(tq3Var), jr3Var, wq3Var2);
        wu3 wu3Var = this.a;
        ii3 k = wu3Var.i.k(dt3Var, nw2.s(ar3Var));
        k.a(new yc2(k, new eb2(wu3Var, dt3Var, this.c), (byte) 0), new ba(wu3Var, (byte) 2));
    }
}
