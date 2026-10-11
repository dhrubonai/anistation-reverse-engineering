package s;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import p7.a0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f9687e;

    /* renamed from: a, reason: collision with root package name */
    public int f9688a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f9689b = -1;

    /* renamed from: c, reason: collision with root package name */
    public float f9690c = Float.NaN;

    /* renamed from: d, reason: collision with root package name */
    public float f9691d = Float.NaN;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9687e = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.f9718e);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            switch (f9687e.get(index)) {
                case 1:
                    this.f9691d = obtainStyledAttributes.getFloat(index, this.f9691d);
                    break;
                case 2:
                    this.f9689b = obtainStyledAttributes.getInt(index, this.f9689b);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = a0.B[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f9688a = m.f(obtainStyledAttributes, index, this.f9688a);
                    break;
                case 6:
                    this.f9690c = obtainStyledAttributes.getFloat(index, this.f9690c);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
