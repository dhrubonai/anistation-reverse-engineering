package androidx.core.graphics.drawable;

import a0.d;
import a0.f;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f788k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f789a;

    /* renamed from: b, reason: collision with root package name */
    public Object f790b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f791c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f792d;

    /* renamed from: e, reason: collision with root package name */
    public int f793e;

    /* renamed from: f, reason: collision with root package name */
    public int f794f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f795g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f796h;

    /* renamed from: i, reason: collision with root package name */
    public String f797i;

    /* renamed from: j, reason: collision with root package name */
    public String f798j;

    public IconCompat() {
        this.f789a = -1;
        this.f791c = null;
        this.f792d = null;
        this.f793e = 0;
        this.f794f = 0;
        this.f795g = null;
        this.f796h = f788k;
        this.f797i = null;
    }

    public static Bitmap a(Bitmap bitmap) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min * 0.5f;
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, 0.9166667f * f10, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(int i10) {
        if (i10 != 0) {
            IconCompat iconCompat = new IconCompat(0);
            iconCompat.f793e = i10;
            iconCompat.f790b = "";
            iconCompat.f798j = "";
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i10 = this.f789a;
        if (i10 == -1) {
            int i11 = Build.VERSION.SDK_INT;
            Object obj = this.f790b;
            if (i11 >= 28) {
                return f.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }
        if (i10 == 2) {
            return this.f793e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri d() {
        int i10 = this.f789a;
        if (i10 == -1) {
            return d.a(this.f790b);
        }
        if (i10 != 4 && i10 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f790b);
    }

    public final String toString() {
        String str;
        if (this.f789a == -1) {
            return String.valueOf(this.f790b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f789a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f789a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f790b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f790b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f798j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f793e);
                if (this.f794f != 0) {
                    sb.append(" off=");
                    sb.append(this.f794f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f790b);
                break;
        }
        if (this.f795g != null) {
            sb.append(" tint=");
            sb.append(this.f795g);
        }
        if (this.f796h != f788k) {
            sb.append(" mode=");
            sb.append(this.f796h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i10) {
        this.f791c = null;
        this.f792d = null;
        this.f793e = 0;
        this.f794f = 0;
        this.f795g = null;
        this.f796h = f788k;
        this.f797i = null;
        this.f789a = 2;
    }
}
