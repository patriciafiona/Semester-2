function varargout = Prim_Algorithm(varargin)

gui_Singleton = 1;
gui_State = struct('gui_Name',       mfilename, ...
                   'gui_Singleton',  gui_Singleton, ...
                   'gui_OpeningFcn', @Prim_Algorithm_OpeningFcn, ...
                   'gui_OutputFcn',  @Prim_Algorithm_OutputFcn, ...
                   'gui_LayoutFcn',  [] , ...
                   'gui_Callback',   []);
if nargin && ischar(varargin{1})
    gui_State.gui_Callback = str2func(varargin{1});
end

if nargout
    [varargout{1:nargout}] = gui_mainfcn(gui_State, varargin{:});
else
    gui_mainfcn(gui_State, varargin{:});
end
% End initialization code - DO NOT EDIT


% --- Executes just before Prim_Algorithm is made visible.
function Prim_Algorithm_OpeningFcn(hObject, eventdata, handles, varargin)

handles.output = hObject;

% Update handles structure
guidata(hObject, handles);


% --- Outputs from this function are returned to the command line.
function varargout = Prim_Algorithm_OutputFcn(hObject, eventdata, handles) 

% Get default command line output from handles structure
varargout{1} = handles.output;


% --- Executes on button press in open.
function open_Callback(hObject, eventdata, handles)

[file,path] = uigetfile({'*.xls;*.xlsx','Excel Files'},' Select data file')
filename = strcat(path,file);

data = xlsread(filename);

%<<< PROSES >>> 
%bagian mengubah matriks  menjadi array x, y, dan w
baris = size(data,1);
kolom = size(data,2);
i=1;

%lihat dari hasil popupmenunya
switch get(handles.choose,'Value')
    case 1 %kalau dia pilih matrix
        %buat array kosongnya
        x = [];
        y = [];
        w = [];

        %proses pemilahan data dari matriks 
        if(baris~=kolom)
            %cek apakah panjang baris sama kolom sama (matriks)
            msgbox('Invalid rows and columns','Error','error')
        else
            for k=1:baris
                for l=1:kolom
                    if(k==l)
                        %di skip kalo ke dirinya sendiri
                        break;
                    else
                        if(data(k,l)==0)
                            %di skip kalo nilainya 0
                            l=l+1;
                        else
                            x(i) = k;
                            y(i) = l;
                            w(i) = data(k,l);
                            i=i+1;
                        end
                    end
                end
            end               
            
            disp(x)
            disp(y)
            disp(w)
            
            %bagian memasukkan data ke table
            set(handles.uitable2, 'Data',data);

            %bagian mengubah data array table menjadi graph
            X = x(1,:);
            Y = y(1,:);
            W = w(1,:);

            G = graph(X,Y,W);
        end

    case 2 %kalau dia pilih table
        data(:,:);
        set(handles.uitable2, 'Data',data);

        %bagian mengubah data table menjadi graph
        x = data(:,1);
        y = data(:,2);
        w = data(:,3);

        G = graph(x,y,w);
        
    otherwise

        %bagian memasukkan data ke table
        set(handles.uitable2, 'Data',data);

        %bagian mengubah data array table menjadi graph
        X = x(1,:);
        Y = y(1,:);
        W = w(1,:);

        G = graph(X,Y,W); 
end

p = plot(G,'EdgeLabel',G.Edges.Weight);

%menandakan bagian algoritma PRIM nya...
[T,pred] = minspantree(G,'Method','dense');
highlight(p,T)


% --- Executes on button press in exit.
function exit_Callback(hObject, eventdata, handles)

button = questdlg('Are you sure you want to quit?','Exit Dialog','Yes','No','No');
%clear the commant windows
clc;
switch button
    case 'Yes',
        disp('Exiting MATLAB')
        delete(handles.kosong);
    case 'No',
        quit cancel;
end


% --- Executes on selection change in choose.
function choose_Callback(hObject, eventdata, handles)

% --- Executes during object creation, after setting all properties.
function choose_CreateFcn(hObject, eventdata, handles)
% Hint: popupmenu controls usually have a white background on Windows.
%       See ISPC and COMPUTER.
if ispc && isequal(get(hObject,'BackgroundColor'), get(0,'defaultUicontrolBackgroundColor'))
    set(hObject,'BackgroundColor','white');
end
