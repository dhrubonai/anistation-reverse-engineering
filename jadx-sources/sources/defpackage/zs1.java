package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zs1 extends nx7 {
    public final eq E;
    public final ts1 F;
    public boolean G = true;

    public zs1(eq eqVar) {
        this.E = eqVar;
        this.F = new ts1(eqVar);
    }

    @Override // defpackage.nx7
    public final InputFilter[] E(InputFilter[] inputFilterArr) {
        if (!this.G) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof ts1) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            ts1 ts1Var = this.F;
            if (i4 < length2) {
                if (inputFilterArr[i4] == ts1Var) {
                    return inputFilterArr;
                }
                i4++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = ts1Var;
                return inputFilterArr3;
            }
        }
    }

    @Override // defpackage.nx7
    public final void T(boolean z) {
        if (z) {
            X();
        }
    }

    @Override // defpackage.nx7
    public final void U(boolean z) {
        this.G = z;
        X();
        eq eqVar = this.E;
        eqVar.setFilters(E(eqVar.getFilters()));
    }

    public final void X() {
        eq eqVar = this.E;
        TransformationMethod transformationMethod = eqVar.getTransformationMethod();
        if (this.G) {
            if (!(transformationMethod instanceof dt1) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new dt1(transformationMethod);
            }
        } else if (transformationMethod instanceof dt1) {
            transformationMethod = ((dt1) transformationMethod).x;
        }
        eqVar.setTransformationMethod(transformationMethod);
    }
}
