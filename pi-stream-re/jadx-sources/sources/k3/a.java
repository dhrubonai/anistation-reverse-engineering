package k3;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
import p7.a0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f6435a;

    /* renamed from: b, reason: collision with root package name */
    public final e f6436b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6437c;

    /* renamed from: d, reason: collision with root package name */
    public final File f6438d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6439e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6440f = false;

    /* renamed from: g, reason: collision with root package name */
    public b[] f6441g;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f6442h;

    public a(AssetManager assetManager, k.a aVar, e eVar, String str, File file) {
        byte[] bArr;
        this.f6435a = aVar;
        this.f6436b = eVar;
        this.f6439e = str;
        this.f6438d = file;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24 && i10 <= 33) {
            switch (i10) {
                case 24:
                case 25:
                    bArr = a0.f8659y;
                    break;
                case 26:
                    bArr = a0.f8658x;
                    break;
                case 27:
                    bArr = a0.f8657w;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = a0.f8656v;
                    break;
                case 31:
                case 32:
                case 33:
                    bArr = a0.f8655u;
                    break;
            }
            this.f6437c = bArr;
        }
        bArr = null;
        this.f6437c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f6436b.i();
            }
            return null;
        }
    }

    public final void b(int i10, Serializable serializable) {
        this.f6435a.execute(new f1.k(this, i10, serializable, 3));
    }
}
