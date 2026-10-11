package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m65 {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof m65) {
            if (this.a != ((m65) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        byte b = this.a;
        if (b == 0) {
            return "Button";
        }
        if (b == 1) {
            return "Checkbox";
        }
        if (b == 2) {
            return "Switch";
        }
        if (b == 3) {
            return "RadioButton";
        }
        if (b == 4) {
            return "Tab";
        }
        if (b == 5) {
            return "Image";
        }
        if (b == 6) {
            return "DropdownList";
        }
        if (b == 7) {
            return "Picker";
        }
        if (b == 8) {
            return "Carousel";
        }
        return "Unknown";
    }
}
