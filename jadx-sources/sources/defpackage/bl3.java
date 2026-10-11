package defpackage;

import com.unity3d.ads.core.domain.AndroidGetIsModulesInitEnabled;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class bl3 {
    public static volatile byte a = 0;
    public static final d64 b = new d64((byte) 1);
    public static final d64 c = new d64((byte) 0);
    public static volatile d64 d;
    public static final String[] e;

    static {
        String str;
        try {
            str = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            str.equalsIgnoreCase(AndroidGetIsModulesInitEnabled.ENABLE_MODULES_INIT_VALUE);
        }
        e = new String[]{"2.0"};
    }

    public static ArrayList a() {
        ServiceLoader serviceLoader;
        ArrayList arrayList = new ArrayList();
        final ClassLoader classLoader = bl3.class.getClassLoader();
        String property = System.getProperty("slf4j.provider");
        d64 d64Var = null;
        if (property != null && !property.isEmpty()) {
            try {
                String str = "Attempting to load provider \"" + property + "\" specified via \"slf4j.provider\" system property";
                if (qx1.a(2) >= qx1.a(j35.b)) {
                    j35.b().println("SLF4J(I): ".concat(str));
                }
                d64Var = (d64) classLoader.loadClass(property).getConstructor(null).newInstance(null);
            } catch (ClassCastException e2) {
                j35.a("Specified SLF4JServiceProvider (" + property + ") does not implement SLF4JServiceProvider interface", e2);
            } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e3) {
                j35.a("Failed to instantiate the specified SLF4JServiceProvider (" + property + ")", e3);
            }
        }
        if (d64Var != null) {
            arrayList.add(d64Var);
            return arrayList;
        }
        if (System.getSecurityManager() == null) {
            serviceLoader = ServiceLoader.load(d64.class, classLoader);
        } else {
            serviceLoader = (ServiceLoader) AccessController.doPrivileged(new PrivilegedAction() { // from class: al3
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    return ServiceLoader.load(d64.class, classLoader);
                }
            });
        }
        Iterator it = serviceLoader.iterator();
        while (it.hasNext()) {
            try {
                arrayList.add((d64) it.next());
            } catch (ServiceConfigurationError e4) {
                j35.b().println("SLF4J(E): ".concat("A service provider failed to instantiate:\n" + e4.getMessage()));
            }
        }
        return arrayList;
    }

    public static yk3 b(String str) {
        d64 d64Var;
        bt2 bt2Var;
        if (a == 0) {
            synchronized (bl3.class) {
                try {
                    if (a == 0) {
                        a = (byte) 1;
                        c();
                    }
                } finally {
                }
            }
        }
        byte b2 = a;
        if (b2 != 1) {
            if (b2 != 2) {
                if (b2 != 3) {
                    if (b2 == 4) {
                        d64Var = c;
                    } else {
                        ze0.m("Unreachable code");
                        return null;
                    }
                } else {
                    d64Var = d;
                }
            } else {
                ze0.m("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also https://www.slf4j.org/codes.html#unsuccessfulInit");
                return null;
            }
        } else {
            d64Var = b;
        }
        switch (d64Var.a) {
            case 0:
                bt2Var = (m18) d64Var.b;
                break;
            default:
                bt2Var = (i16) d64Var.b;
                break;
        }
        return bt2Var.x(str);
    }

    public static final void c() {
        Enumeration<URL> resources;
        try {
            ArrayList a2 = a();
            g(a2);
            if (!a2.isEmpty()) {
                d = (d64) a2.get(0);
                d.getClass();
                d.getClass();
                a = (byte) 3;
                e(a2);
            } else {
                a = (byte) 4;
                j35.c("No SLF4J providers were found.");
                j35.c("Defaulting to no-operation (NOP) logger implementation");
                j35.c("See https://www.slf4j.org/codes.html#noProviders for further details.");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                try {
                    ClassLoader classLoader = bl3.class.getClassLoader();
                    if (classLoader == null) {
                        resources = ClassLoader.getSystemResources("org/slf4j/impl/StaticLoggerBinder.class");
                    } else {
                        resources = classLoader.getResources("org/slf4j/impl/StaticLoggerBinder.class");
                    }
                    while (resources.hasMoreElements()) {
                        linkedHashSet.add(resources.nextElement());
                    }
                } catch (IOException e2) {
                    j35.a("Error getting resources from path", e2);
                }
                f(linkedHashSet);
            }
            d();
            if (a == 3) {
                try {
                    switch (d.a) {
                        case 0:
                            boolean z = false;
                            for (String str : e) {
                                if ("2.0.99".startsWith(str)) {
                                    z = true;
                                }
                            }
                            if (!z) {
                                j35.c("The requested version 2.0.99 by your slf4j provider is not compatible with " + Arrays.asList(e).toString());
                                j35.c("See https://www.slf4j.org/codes.html#version_mismatch for further details.");
                                return;
                            }
                            return;
                        default:
                            throw new UnsupportedOperationException();
                    }
                } catch (Throwable th) {
                    j35.a("Unexpected problem occurred during version sanity check", th);
                }
            }
        } catch (Exception e3) {
            a = (byte) 2;
            j35.a("Failed to instantiate SLF4J LoggerFactory", e3);
            throw new IllegalStateException("Unexpected initialization failure", e3);
        }
    }

    public static void d() {
        d64 d64Var = b;
        synchronized (d64Var) {
            try {
                ((i16) d64Var.b).x = true;
                ArrayList arrayList = new ArrayList(((i16) d64Var.b).y.values());
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    h16 h16Var = (h16) obj;
                    h16Var.y = b(h16Var.x);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        LinkedBlockingQueue linkedBlockingQueue = ((i16) b.b).z;
        int size2 = linkedBlockingQueue.size();
        ArrayList arrayList2 = new ArrayList(128);
        int i2 = 0;
        while (linkedBlockingQueue.drainTo(arrayList2, 128) != 0) {
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                j16 j16Var = (j16) obj2;
                if (j16Var != null) {
                    h16 h16Var2 = j16Var.b;
                    String str = h16Var2.x;
                    if (h16Var2.y != null) {
                        if (!(h16Var2.y instanceof c64)) {
                            if (h16Var2.k()) {
                                if (h16Var2.i(j16Var.a) && h16Var2.k()) {
                                    try {
                                        h16Var2.A.invoke(h16Var2.y, j16Var);
                                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
                                    }
                                }
                            } else {
                                j35.c(str);
                            }
                        }
                    } else {
                        ze0.m("Delegate logger cannot be null at this state.");
                        return;
                    }
                }
                int i4 = i2 + 1;
                if (i2 == 0) {
                    if (j16Var.b.k()) {
                        j35.c("A number (" + size2 + ") of logging calls during the initialization phase have been intercepted and are");
                        j35.c("now being replayed. These are subject to the filtering rules of the underlying logging system.");
                        j35.c("See also https://www.slf4j.org/codes.html#replay");
                    } else if (!(j16Var.b.y instanceof c64)) {
                        j35.c("The following set of substitute loggers may have been accessed");
                        j35.c("during the initialization phase. Logging calls during this");
                        j35.c("phase were not honored. However, subsequent logging calls to these");
                        j35.c("loggers will work as normally expected.");
                        j35.c("See also https://www.slf4j.org/codes.html#substituteLogger");
                    }
                }
                i2 = i4;
            }
            arrayList2.clear();
        }
        i16 i16Var = (i16) b.b;
        i16Var.y.clear();
        i16Var.z.clear();
    }

    public static void e(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() > 1) {
                String str = "Actual provider is of type [" + arrayList.get(0) + "]";
                if (qx1.a(2) >= qx1.a(j35.b)) {
                    j35.b().println("SLF4J(I): ".concat(str));
                    return;
                }
                return;
            }
            String str2 = "Connected with provider of type [" + ((d64) arrayList.get(0)).getClass().getName() + "]";
            int i = j35.a;
            if (qx1.a(1) >= qx1.a(j35.b)) {
                j35.b().println("SLF4J(D): ".concat(str2));
                return;
            }
            return;
        }
        ze0.m("No providers were found which is impossible after successful initialization.");
    }

    public static void f(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return;
        }
        j35.c("Class path contains SLF4J bindings targeting slf4j-api versions 1.7.x or earlier.");
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            j35.c("Ignoring binding found at [" + ((URL) it.next()) + "]");
        }
        j35.c("See https://www.slf4j.org/codes.html#ignoredBindings for an explanation.");
    }

    public static void g(ArrayList arrayList) {
        if (arrayList.size() > 1) {
            j35.c("Class path contains multiple SLF4J providers.");
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                j35.c("Found provider [" + ((d64) obj) + "]");
            }
            j35.c("See https://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
