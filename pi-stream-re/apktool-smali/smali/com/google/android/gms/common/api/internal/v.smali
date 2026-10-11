.class public final Lcom/google/android/gms/common/api/internal/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Z

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/common/api/internal/v;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/common/api/internal/v;->c:Z

    iput v0, p0, Lcom/google/android/gms/common/api/internal/v;->b:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/google/android/gms/common/api/internal/v;->a:I

    .line 4
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance p1, Lg/f;

    const/16 v0, 0xa

    invoke-direct {p1, p0, v0}, Lg/f;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;I)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, Lcom/google/android/gms/common/api/internal/v;->a:I

    .line 6
    invoke-direct {p0, p1}, Lcom/google/android/gms/common/api/internal/v;-><init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V

    return-void
.end method

.method public constructor <init>(Lcom/google/android/material/sidesheet/SideSheetBehavior;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/common/api/internal/v;->a:I

    .line 2
    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Landroidx/activity/b;

    const/16 v0, 0x10

    invoke-direct {p1, p0, v0}, Landroidx/activity/b;-><init>(Ljava/lang/Object;I)V

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/common/api/internal/s0;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lcom/google/android/gms/common/api/internal/s;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const-string v1, "execute parameter required"

    .line 11
    .line 12
    invoke-static {v1, v0}, Lw7/b;->i(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Lcom/google/android/gms/common/api/internal/s0;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v1, [Lb5/c;

    .line 20
    .line 21
    iget-boolean v2, p0, Lcom/google/android/gms/common/api/internal/v;->c:Z

    .line 22
    .line 23
    iget v3, p0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 24
    .line 25
    invoke-direct {v0, p0, v1, v2, v3}, Lcom/google/android/gms/common/api/internal/s0;-><init>(Lcom/google/android/gms/common/api/internal/v;[Lb5/c;ZI)V

    .line 26
    .line 27
    .line 28
    return-object v0
.end method

.method public final b(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/google/android/gms/common/api/internal/v;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    goto :goto_1

    .line 8
    :pswitch_0
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:Ljava/lang/ref/WeakReference;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iput p1, p0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 24
    .line 25
    iget-boolean p1, p0, Lcom/google/android/gms/common/api/internal/v;->c:Z

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 32
    .line 33
    iget-object p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->U:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroid/view/View;

    .line 40
    .line 41
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/lang/Runnable;

    .line 44
    .line 45
    sget-object v2, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 46
    .line 47
    invoke-static {p1, v0}, Lg0/h0;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    iput-boolean v1, p0, Lcom/google/android/gms/common/api/internal/v;->c:Z

    .line 51
    .line 52
    :cond_1
    :goto_0
    return-void

    .line 53
    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 56
    .line 57
    iget-object v0, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->o:Ljava/lang/ref/WeakReference;

    .line 58
    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    if-nez v0, :cond_2

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    iput p1, p0, Lcom/google/android/gms/common/api/internal/v;->b:I

    .line 69
    .line 70
    iget-boolean p1, p0, Lcom/google/android/gms/common/api/internal/v;->c:Z

    .line 71
    .line 72
    if-nez p1, :cond_3

    .line 73
    .line 74
    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/v;->e:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 77
    .line 78
    iget-object p1, p1, Lcom/google/android/material/sidesheet/SideSheetBehavior;->o:Ljava/lang/ref/WeakReference;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Landroid/view/View;

    .line 85
    .line 86
    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/v;->d:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, Ljava/lang/Runnable;

    .line 89
    .line 90
    sget-object v2, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 91
    .line 92
    invoke-static {p1, v0}, Lg0/h0;->m(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 93
    .line 94
    .line 95
    iput-boolean v1, p0, Lcom/google/android/gms/common/api/internal/v;->c:Z

    .line 96
    .line 97
    :cond_3
    :goto_2
    return-void

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
