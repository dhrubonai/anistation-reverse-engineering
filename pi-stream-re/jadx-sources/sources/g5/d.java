package g5;

import p7.a0;

/* loaded from: classes.dex */
public abstract class d extends c implements c5.b {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        c cVar = (c) obj;
        for (a aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                if (!cVar.isFieldSet(aVar) || !a0.q(getFieldValue(aVar), cVar.getFieldValue(aVar))) {
                    return false;
                }
            } else if (cVar.isFieldSet(aVar)) {
                return false;
            }
        }
        return true;
    }

    @Override // g5.c
    public Object getValueObject(String str) {
        return null;
    }

    public int hashCode() {
        int i10 = 0;
        for (a aVar : getFieldMappings().values()) {
            if (isFieldSet(aVar)) {
                Object fieldValue = getFieldValue(aVar);
                w7.b.s(fieldValue);
                i10 = (i10 * 31) + fieldValue.hashCode();
            }
        }
        return i10;
    }

    @Override // g5.c
    public boolean isPrimitiveFieldSet(String str) {
        return false;
    }
}
