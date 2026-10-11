package e8;

import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAuth f3595a = FirebaseAuth.getInstance();

    public static String a(Exception exc) {
        String localizedMessage;
        if (exc == null || (localizedMessage = exc.getLocalizedMessage()) == null) {
            return "An unknown error occurred";
        }
        if (localizedMessage.contains("no user record")) {
            return "No account found with this email";
        }
        if (!localizedMessage.contains("password is invalid") && !localizedMessage.contains("wrong password")) {
            if (localizedMessage.contains("network error")) {
                return "Network error. Check your connection.";
            }
            if (localizedMessage.contains("email address is already in use")) {
                return "This email is already registered";
            }
            if (localizedMessage.contains("weak password")) {
                return "Password is too weak. Use at least 6 characters.";
            }
            if (localizedMessage.contains("invalid email")) {
                return "Invalid email format";
            }
            if (localizedMessage.contains("too many requests")) {
                return "Too many attempts. Try again later.";
            }
            return localizedMessage;
        }
        return "Incorrect password";
    }
}
