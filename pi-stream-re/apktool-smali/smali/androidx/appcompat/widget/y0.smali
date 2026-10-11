.class public final Landroidx/appcompat/widget/y0;
.super Lz7/c;
.source "SourceFile"


# instance fields
.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/ref/WeakReference;

.field public final synthetic o:Landroidx/appcompat/widget/f1;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/f1;IILjava/lang/ref/WeakReference;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/y0;->o:Landroidx/appcompat/widget/f1;

    .line 2
    .line 3
    iput p2, p0, Landroidx/appcompat/widget/y0;->l:I

    .line 4
    .line 5
    iput p3, p0, Landroidx/appcompat/widget/y0;->m:I

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/appcompat/widget/y0;->n:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {p0}, Lz7/c;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final q(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final r(Landroid/graphics/Typeface;)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-lt v0, v1, :cond_1

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    iget v1, p0, Landroidx/appcompat/widget/y0;->l:I

    .line 9
    .line 10
    if-eq v1, v0, :cond_1

    .line 11
    .line 12
    iget v0, p0, Landroidx/appcompat/widget/y0;->m:I

    .line 13
    .line 14
    and-int/lit8 v0, v0, 0x2

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    invoke-static {p1, v1, v0}, Landroidx/appcompat/widget/e1;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/y0;->o:Landroidx/appcompat/widget/f1;

    .line 26
    .line 27
    iget-boolean v1, v0, Landroidx/appcompat/widget/f1;->m:Z

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    iput-object p1, v0, Landroidx/appcompat/widget/f1;->l:Landroid/graphics/Typeface;

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/appcompat/widget/y0;->n:Ljava/lang/ref/WeakReference;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Landroid/widget/TextView;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    sget-object v2, Lg0/y0;->a:Ljava/util/WeakHashMap;

    .line 44
    .line 45
    invoke-static {v1}, Lg0/k0;->b(Landroid/view/View;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    iget v0, v0, Landroidx/appcompat/widget/f1;->j:I

    .line 52
    .line 53
    new-instance v2, Landroidx/appcompat/widget/z0;

    .line 54
    .line 55
    invoke-direct {v2, v1, p1, v0}, Landroidx/appcompat/widget/z0;-><init>(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    iget v0, v0, Landroidx/appcompat/widget/f1;->j:I

    .line 63
    .line 64
    invoke-virtual {v1, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_1
    return-void
.end method
