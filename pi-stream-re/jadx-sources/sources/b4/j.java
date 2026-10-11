package b4;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class j implements com.bumptech.glide.load.data.e {

    /* renamed from: a, reason: collision with root package name */
    public final Resources.Theme f1469a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f1470b;

    /* renamed from: c, reason: collision with root package name */
    public final k f1471c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1472d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1473e;

    public j(Resources.Theme theme, Resources resources, k kVar, int i10) {
        this.f1469a = theme;
        this.f1470b = resources;
        this.f1471c = kVar;
        this.f1472d = i10;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (((b5.h) this.f1471c).f1526a) {
            case 3:
                return AssetFileDescriptor.class;
            case 4:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        Object obj = this.f1473e;
        if (obj != null) {
            try {
                switch (((b5.h) this.f1471c).f1526a) {
                    case 3:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 4:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
    }

    @Override // com.bumptech.glide.load.data.e
    public final v3.a d() {
        return v3.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        Object openRawResourceFd;
        try {
            k kVar = this.f1471c;
            Resources.Theme theme = this.f1469a;
            Resources resources = this.f1470b;
            int i10 = this.f1472d;
            b5.h hVar = (b5.h) kVar;
            switch (hVar.f1526a) {
                case 3:
                    openRawResourceFd = resources.openRawResourceFd(i10);
                    break;
                case 4:
                    Context context = hVar.f1527b;
                    openRawResourceFd = p7.a0.w(context, context, i10, theme);
                    break;
                default:
                    openRawResourceFd = resources.openRawResource(i10);
                    break;
            }
            this.f1473e = openRawResourceFd;
            dVar.s(openRawResourceFd);
        } catch (Resources.NotFoundException e10) {
            dVar.n(e10);
        }
    }
}
