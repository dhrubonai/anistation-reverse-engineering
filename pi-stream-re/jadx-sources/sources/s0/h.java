package s0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class h extends j6.e {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f9741b;

    /* renamed from: c, reason: collision with root package name */
    public final f f9742c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9743d;

    public h(TextView textView) {
        super(16);
        this.f9741b = textView;
        this.f9743d = true;
        this.f9742c = new f(textView);
    }

    public final void A() {
        TextView textView = this.f9741b;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.f9743d) {
            if (!(transformationMethod instanceof l) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new l(transformationMethod);
            }
        } else if (transformationMethod instanceof l) {
            transformationMethod = ((l) transformationMethod).f9750a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // j6.e
    public final InputFilter[] o(InputFilter[] inputFilterArr) {
        if (!this.f9743d) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i10 = 0; i10 < inputFilterArr.length; i10++) {
                InputFilter inputFilter = inputFilterArr[i10];
                if (inputFilter instanceof f) {
                    sparseArray.put(i10, inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i11 = 0;
                for (int i12 = 0; i12 < length; i12++) {
                    if (sparseArray.indexOfKey(i12) < 0) {
                        inputFilterArr2[i11] = inputFilterArr[i12];
                        i11++;
                    }
                }
                return inputFilterArr2;
            }
            return inputFilterArr;
        }
        int length2 = inputFilterArr.length;
        int i13 = 0;
        while (true) {
            f fVar = this.f9742c;
            if (i13 < length2) {
                if (inputFilterArr[i13] != fVar) {
                    i13++;
                } else {
                    return inputFilterArr;
                }
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = fVar;
                return inputFilterArr3;
            }
        }
    }

    @Override // j6.e
    public final void w(boolean z9) {
        if (z9) {
            A();
        }
    }

    @Override // j6.e
    public final void z(boolean z9) {
        this.f9743d = z9;
        A();
        TextView textView = this.f9741b;
        textView.setFilters(o(textView.getFilters()));
    }
}
