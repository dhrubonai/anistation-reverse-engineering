package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: m, reason: collision with root package name */
    public static final SparseIntArray f9696m;

    /* renamed from: a, reason: collision with root package name */
    public float f9697a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f9698b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f9699c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f9700d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f9701e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f9702f = Float.NaN;

    /* renamed from: g, reason: collision with root package name */
    public float f9703g = Float.NaN;

    /* renamed from: h, reason: collision with root package name */
    public float f9704h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f9705i = 0.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f9706j = 0.0f;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9707k = false;

    /* renamed from: l, reason: collision with root package name */
    public float f9708l = 0.0f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9696m = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f9721h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (f9696m.get(index)) {
                case 1:
                    this.f9697a = obtainStyledAttributes.getFloat(index, this.f9697a);
                    break;
                case 2:
                    this.f9698b = obtainStyledAttributes.getFloat(index, this.f9698b);
                    break;
                case 3:
                    this.f9699c = obtainStyledAttributes.getFloat(index, this.f9699c);
                    break;
                case 4:
                    this.f9700d = obtainStyledAttributes.getFloat(index, this.f9700d);
                    break;
                case 5:
                    this.f9701e = obtainStyledAttributes.getFloat(index, this.f9701e);
                    break;
                case 6:
                    this.f9702f = obtainStyledAttributes.getDimension(index, this.f9702f);
                    break;
                case zzaja.zze.zzg /* 7 */:
                    this.f9703g = obtainStyledAttributes.getDimension(index, this.f9703g);
                    break;
                case 8:
                    this.f9704h = obtainStyledAttributes.getDimension(index, this.f9704h);
                    break;
                case 9:
                    this.f9705i = obtainStyledAttributes.getDimension(index, this.f9705i);
                    break;
                case 10:
                    this.f9706j = obtainStyledAttributes.getDimension(index, this.f9706j);
                    break;
                case ModuleDescriptor.MODULE_VERSION /* 11 */:
                    this.f9707k = true;
                    this.f9708l = obtainStyledAttributes.getDimension(index, this.f9708l);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
