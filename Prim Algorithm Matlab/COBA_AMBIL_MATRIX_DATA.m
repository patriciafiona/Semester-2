clear
clc

[file,path] = uigetfile({'*.xls;*.xlsx','Excel Files'},' Select data file')
filename = strcat(path,file);

data = xlsread(filename);
baris = size(data,1);
kolom = size(data,2);
i=1;

%buat array kosongnya
x = [];
y = [];
w = [];

%proses pemilahan data dari matriks identitas
for k=1:baris
    for l=1:kolom
        if(k==l)
            %di skip kalo ke dirinya sendiri
            break;
        else
            if(data(k,l)==0)
                %di skip kalo nilainya 0
               break;
            else
                x(i) = k;
                y(i) = l;
                w(i) = data(k,l);
                i=i+1;
            end
        end
    end
end

disp(x);
disp(y);
disp(w);