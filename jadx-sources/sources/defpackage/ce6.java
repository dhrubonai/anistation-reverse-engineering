package defpackage;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ce6 extends y2 {
    public static final Parcelable.Creator<ce6> CREATOR = new an7(15);
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public String F;
    public int G;
    public int H;
    public String I;
    public JSONObject J;
    public float x;
    public int y;
    public int z;

    public ce6(float f, int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, int i8, int i9, String str2) {
        this.x = f;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        this.C = i5;
        this.D = i6;
        this.E = i7;
        this.F = str;
        this.G = i8;
        this.H = i9;
        this.I = str2;
        if (str2 != null) {
            try {
                this.J = new JSONObject(this.I);
                return;
            } catch (JSONException unused) {
                this.J = null;
                this.I = null;
                return;
            }
        }
        this.J = null;
    }

    public static final int d(String str) {
        if (str != null && str.length() == 9 && str.charAt(0) == '#') {
            try {
                return Color.argb(Integer.parseInt(str.substring(7, 9), 16), Integer.parseInt(str.substring(1, 3), 16), Integer.parseInt(str.substring(3, 5), 16), Integer.parseInt(str.substring(5, 7), 16));
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    public static final String f(int i) {
        return String.format("#%02X%02X%02X%02X", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Integer.valueOf(Color.alpha(i)));
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fontScale", this.x);
            int i = this.y;
            if (i != 0) {
                jSONObject.put("foregroundColor", f(i));
            }
            int i2 = this.z;
            if (i2 != 0) {
                jSONObject.put("backgroundColor", f(i2));
            }
            int i3 = this.A;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                jSONObject.put("edgeType", "DEPRESSED");
                            }
                        } else {
                            jSONObject.put("edgeType", "RAISED");
                        }
                    } else {
                        jSONObject.put("edgeType", "DROP_SHADOW");
                    }
                } else {
                    jSONObject.put("edgeType", "OUTLINE");
                }
            } else {
                jSONObject.put("edgeType", "NONE");
            }
            int i4 = this.B;
            if (i4 != 0) {
                jSONObject.put("edgeColor", f(i4));
            }
            int i5 = this.C;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        jSONObject.put("windowType", "ROUNDED_CORNERS");
                    }
                } else {
                    jSONObject.put("windowType", "NORMAL");
                }
            } else {
                jSONObject.put("windowType", "NONE");
            }
            int i6 = this.D;
            if (i6 != 0) {
                jSONObject.put("windowColor", f(i6));
            }
            if (this.C == 2) {
                jSONObject.put("windowRoundedCornerRadius", this.E);
            }
            String str = this.F;
            if (str != null) {
                jSONObject.put("fontFamily", str);
            }
            switch (this.G) {
                case 0:
                    jSONObject.put("fontGenericFamily", "SANS_SERIF");
                    break;
                case 1:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
                    break;
                case 2:
                    jSONObject.put("fontGenericFamily", "SERIF");
                    break;
                case 3:
                    jSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
                    break;
                case 4:
                    jSONObject.put("fontGenericFamily", "CASUAL");
                    break;
                case 5:
                    jSONObject.put("fontGenericFamily", "CURSIVE");
                    break;
                case 6:
                    jSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
                    break;
            }
            int i7 = this.H;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 == 3) {
                            jSONObject.put("fontStyle", "BOLD_ITALIC");
                        }
                    } else {
                        jSONObject.put("fontStyle", "ITALIC");
                    }
                } else {
                    jSONObject.put("fontStyle", "BOLD");
                }
            } else {
                jSONObject.put("fontStyle", "NORMAL");
            }
            JSONObject jSONObject2 = this.J;
            if (jSONObject2 != null) {
                jSONObject.put("customData", jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ce6)) {
            return false;
        }
        ce6 ce6Var = (ce6) obj;
        JSONObject jSONObject = this.J;
        if (jSONObject != null) {
            z = false;
        } else {
            z = true;
        }
        JSONObject jSONObject2 = ce6Var.J;
        if (jSONObject2 != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z != z2) {
            return false;
        }
        if ((jSONObject == null || jSONObject2 == null || w63.a(jSONObject, jSONObject2)) && this.x == ce6Var.x && this.y == ce6Var.y && this.z == ce6Var.z && this.A == ce6Var.A && this.B == ce6Var.B && this.C == ce6Var.C && this.D == ce6Var.D && this.E == ce6Var.E && qi0.c(this.F, ce6Var.F) && this.G == ce6Var.G && this.H == ce6Var.H) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.z), Integer.valueOf(this.A), Integer.valueOf(this.B), Integer.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(this.E), this.F, Integer.valueOf(this.G), Integer.valueOf(this.H), String.valueOf(this.J)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String jSONObject;
        JSONObject jSONObject2 = this.J;
        if (jSONObject2 == null) {
            jSONObject = null;
        } else {
            jSONObject = jSONObject2.toString();
        }
        this.I = jSONObject;
        int s0 = z51.s0(parcel, 20293);
        float f = this.x;
        z51.r0(parcel, 2, 4);
        parcel.writeFloat(f);
        int i2 = this.y;
        z51.r0(parcel, 3, 4);
        parcel.writeInt(i2);
        int i3 = this.z;
        z51.r0(parcel, 4, 4);
        parcel.writeInt(i3);
        int i4 = this.A;
        z51.r0(parcel, 5, 4);
        parcel.writeInt(i4);
        int i5 = this.B;
        z51.r0(parcel, 6, 4);
        parcel.writeInt(i5);
        int i6 = this.C;
        z51.r0(parcel, 7, 4);
        parcel.writeInt(i6);
        int i7 = this.D;
        z51.r0(parcel, 8, 4);
        parcel.writeInt(i7);
        int i8 = this.E;
        z51.r0(parcel, 9, 4);
        parcel.writeInt(i8);
        z51.m0(parcel, 10, this.F);
        int i9 = this.G;
        z51.r0(parcel, 11, 4);
        parcel.writeInt(i9);
        int i10 = this.H;
        z51.r0(parcel, 12, 4);
        parcel.writeInt(i10);
        z51.m0(parcel, 13, this.I);
        z51.t0(parcel, s0);
    }
}
