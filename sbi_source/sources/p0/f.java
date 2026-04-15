package p0;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final class f extends a0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f1884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f1885b;
    public boolean c = true;

    public f(TextView textView) {
        this.f1884a = textView;
        this.f1885b = new d(textView);
    }

    @Override // a0.a
    public final void d0(boolean z) {
        if (z) {
            n0();
        }
    }

    @Override // a0.a
    public final void e0(boolean z) {
        this.c = z;
        n0();
        TextView textView = this.f1884a;
        textView.setFilters(u(textView.getFilters()));
    }

    public final void n0() {
        TextView textView = this.f1884a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.c) {
            if (!(transformationMethod instanceof j) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new j(transformationMethod);
            }
        } else if (transformationMethod instanceof j) {
            transformationMethod = ((j) transformationMethod).f1890a;
        }
        textView.setTransformationMethod(transformationMethod);
    }

    @Override // a0.a
    public final InputFilter[] u(InputFilter[] inputFilterArr) {
        if (!this.c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i2 = 0; i2 < inputFilterArr.length; i2++) {
                InputFilter inputFilter = inputFilterArr[i2];
                if (inputFilter instanceof d) {
                    sparseArray.put(i2, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i3 = 0;
            for (int i4 = 0; i4 < length; i4++) {
                if (sparseArray.indexOfKey(i4) < 0) {
                    inputFilterArr2[i3] = inputFilterArr[i4];
                    i3++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i5 = 0;
        while (true) {
            d dVar = this.f1885b;
            if (i5 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = dVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i5] == dVar) {
                return inputFilterArr;
            }
            i5++;
        }
    }
}
